package e.yunus.challangeintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivMood, ivPhone, ivWeb, ivLocation;
    Button btnCreate;

    //request code for intent result
    final int CREATE_CONTACT = 1;

    String name = "", number= "", web = "", map = "", mood = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivMood = (ImageView)findViewById(R.id.ivMood);
        ivPhone = (ImageView) findViewById(R.id.ivPhone);
        ivWeb = (ImageView)findViewById(R.id.ivWeb);
        ivLocation = (ImageView)findViewById(R.id.ivLocation);
        btnCreate= (Button)findViewById(R.id.btnCreate);


//        fungsi untuk menghiden suatu item layout
        //-------------------------------------------
        ivMood.setVisibility(View.GONE);
        ivPhone.setVisibility(View.GONE);
        ivWeb.setVisibility(View.GONE);
        ivLocation.setVisibility(View.GONE);



        //-------------------------------------------
        //btn intent
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateContact.class);

                //intent back this activity  // prameter CREATE_CONTACT bersasal dari final int
                startActivityForResult(intent, CREATE_CONTACT);
            }
        });

        //implicit intent // + number etc from intent put extra
        ivPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("telp: " + number));
                startActivity(intent);
            }
        });

        ivWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:://" + web));
                startActivity(intent);
            }
        });

        ivLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + map));
                startActivity(intent);
            }
        });
    }
    //ActivityResultMethod //nyambung dengan btn intent
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //requestCode ambil dari onActivityResult
        if (requestCode == CREATE_CONTACT){
            //resultCode ambil dari onACtivityResult
            if(resultCode ==RESULT_OK){

                // membuka item yang di tutup sebelumnya dengan Gone
                ivMood.setVisibility(View.VISIBLE);
                ivPhone.setVisibility(View.VISIBLE);
                ivWeb.setVisibility(View.VISIBLE);
                ivLocation.setVisibility(View.VISIBLE);

                /**
                 * ambil key string dari CreateContact
                 *  data. ambil dari onActivityResult
                 */

                name = data.getStringExtra("name");
                number = data.getStringExtra("number");
                web = data.getStringExtra("web");
                map = data.getStringExtra("map");
                mood = data.getStringExtra("mood");

                if (mood.equals("happy")){
                    ivMood.setImageResource(R.drawable.happy);
                }else if(mood.equals("ok")){
                    ivMood.setImageResource(R.drawable.ok);
                }else {
                    ivMood.setImageResource(R.drawable.sad);
                }
            }else {
                Toast.makeText(MainActivity.this, "no data post", Toast.LENGTH_SHORT).show();

            }
        }
    }
}
