package e.yunus.magicidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    Button btnSubmit;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = (EditText) findViewById(R.id.etID);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        Result = (TextView) findViewById(R.id.tvResult);

        Result.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idNumber = etID.getText().toString().trim();
                String dob = idNumber.substring(0,6);

                int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));
                String sGender;
                if (gender < 5)
                    sGender = getString(R.string.female);
                else
                    sGender = getString(R.string.male);

                int nasionality = Integer.parseInt(Character.toString(idNumber.charAt(10)));
                String sNasionlality ;
                if (nasionality == 0){
                    sNasionlality = getString(R.string.sa_cit);
                }else
                    sNasionlality = getString(R.string.permanent_Resident);

                String text = getString(R.string.dob) + dob + "\n" +
                        getString(R.string.gender) + sGender + "\n" +
                        getString(R.string.nasionality) +  sNasionlality;
                Result.setText(text);

                Result.setVisibility(View.VISIBLE);
            }
        });
    }
}
