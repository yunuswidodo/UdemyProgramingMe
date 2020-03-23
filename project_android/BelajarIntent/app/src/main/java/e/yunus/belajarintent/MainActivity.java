package e.yunus.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button activity1, activity2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.etIdea);
        activity1 = (Button) findViewById(R.id.activity1);
        activity2 = (Button)findViewById(R.id.acivity2);
        result =  (TextView) findViewById(R.id.tvResult);
    }
}
