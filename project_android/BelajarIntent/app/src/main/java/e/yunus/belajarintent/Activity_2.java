package e.yunus.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {

    TextView tvWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvWelcome = (TextView) findViewById(R.id.tvWelcome);
        String name =getIntent().getStringExtra("name");    //getStringExtra tergantung data yang dilempar
        tvWelcome.setText(name + " welcome to activity 2");
    }
}
