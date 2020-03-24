package e.yunus.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_3 extends AppCompatActivity {

    EditText surname;
    Button btnSubmit, btnsubmit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        surname = (EditText)findViewById(R.id.etSurname);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnsubmit2 = (Button) findViewById(R.id.btnSubmit2);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (surname.getText().toString().isEmpty()){
                    Toast.makeText(Activity_3.this, "plese enter surname", Toast.LENGTH_SHORT).show();
                }else {
                    String Surname2 = surname.getText().toString().trim();
                    Intent intent = new Intent();
                    intent.putExtra("surname", Surname2);
                    setResult(RESULT_OK, intent);
                    Activity_3.this.finish();
                }
            }
        });

        btnsubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                Activity_3.this.finish();
            }
        });
    }
}
