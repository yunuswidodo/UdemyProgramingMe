package e.yunus.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected{

    TextView tvDescription;
    ArrayList<String> description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDescription = (TextView)findViewById(R.id.tvDescription);
        description = new ArrayList<String>();
        description.add("Description 1");
        description.add("Description 2");
        description.add("Description 3");
    }

    @Override
    public void onItemSelected(int index) {
        tvDescription.setText(description.get(index));
    }
}
