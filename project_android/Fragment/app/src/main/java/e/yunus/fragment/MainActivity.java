package e.yunus.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected{

    TextView tvDescription;
    String [] description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDescription = (TextView) findViewById(R.id.tvDescription);

        description = getResources().getStringArray(R.array.descriptions);

        //berdiri
        if (findViewById(R.id.layout_potrait) != null){
            FragmentManager manager = this.getSupportFragmentManager();
            manager.beginTransaction()
                    .hide(manager.findFragmentById(R.id.detailFrag))
                    .show(manager.findFragmentById(R.id.listFrag))
                    .commit();
        }
        //tidur
        if (findViewById(R.id.layout_land) != null){
            FragmentManager manager = this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.listFrag))
                    .show(manager.findFragmentById(R.id.detailFrag))
                    .commit();
        }
    }


    @Override
    public void onItemSelected(int index) {
        tvDescription.setText(description[index]);

        if(findViewById(R.id.layout_potrait) != null){
            FragmentManager manager = this.getSupportFragmentManager();
            manager.beginTransaction()
                    .hide(manager.findFragmentById(R.id.listFrag))
                    .show(manager.findFragmentById(R.id.detailFrag))
                    .addToBackStack(null)
                    .commit();
        }
    }
}
