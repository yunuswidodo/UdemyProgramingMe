package e.yunus.challangeintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CreateContact extends AppCompatActivity implements View.OnClickListener {

    EditText etName, etNumber, etWeb, etMap;
    ImageView ivHappy, ivOK, ivSad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact);

        etName = (EditText) findViewById(R.id.etName);
        etNumber = (EditText) findViewById(R.id.etNumber);
        etWeb = (EditText) findViewById(R.id.etWeb);
        etMap = (EditText) findViewById(R.id.etMap);

        ivHappy = (ImageView) findViewById(R.id.ivHappy);
        ivOK = (ImageView) findViewById(R.id.ivOk);
        ivSad = (ImageView) findViewById(R.id.ivSad);

        //terhandle onclik  dibawah
        ivHappy.setOnClickListener(this);
        ivOK.setOnClickListener(this);
        ivSad.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (etName.getText().toString().isEmpty() || etNumber.getText().toString().isEmpty() ||
                etWeb.getText().toString().isEmpty() || etMap.getText().toString().isEmpty()) {
            Toast.makeText(CreateContact.this, "pleade insert field", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent();
            intent.putExtra("name", etName.getText().toString().trim());
            intent.putExtra("number", etNumber.getText().toString().trim());
            intent.putExtra("web", etWeb.getText().toString().trim());
            intent.putExtra("map", etMap.getText().toString().trim());

            // terhandle on click listener
            if (v.getId() == R.id.ivHappy) {
                    intent.putExtra("mood", "happy");
            } else if (v.getId() == R.id.ivOk) {
                    intent.putExtra("mood", "ok");
            } else {
                    intent.putExtra("mood", "sad");
            }
            setResult(RESULT_OK, intent);
            CreateContact.this.finish();  // jika selesai kembali keMainActivity
        }

    }
}
