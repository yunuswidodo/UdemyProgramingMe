package e.yunus.cricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textViewresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.etInNumber);
        button = (Button)findViewById(R.id.btnPredic);
        textViewresult = (TextView) findViewById(R.id.predictResult);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ("coba");

                textViewresult.setText(text);
            }
        });
    }
}
