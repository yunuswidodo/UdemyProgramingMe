package e.yunus.belajarintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button activity1, activity2;
    TextView result;

    final int ACTIVITY3 = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.etIdea);
        activity1 = (Button) findViewById(R.id.activity1);
        activity2 = (Button)findViewById(R.id.acivity2);
        result =  (TextView) findViewById(R.id.tvResult);


        activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "plese insert worfd", Toast.LENGTH_SHORT).show();
                }else{
                    String name = editText.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this, Activity_2.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
            }
        });

        activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_3.class);
                startActivityForResult(intent, ACTIVITY3);
            }
        });
    }

    // mengembalikan data yang setelah submit
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == ACTIVITY3){
        if (resultCode == RESULT_OK){
            result.setText(data.getStringExtra("surname"));   //data ambil dari atas surname key
        }
        if (resultCode == RESULT_CANCELED){
            result.setText("no data rechived");
        }
        }
    }


}
