package net.rohitchopra.interactivestory;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private EditText mNameField;
    private Button mSTartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText)findViewById(R.id.nameEditText);
        mSTartButton = (Button)findViewById(R.id.startButton);

        mSTartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = mNameField.getText().toString();
//              Toast.makeText(MainActivity.this,name,Toast.LENGTH_LONG).show();
                startStory();
            }
        });

    }


    private void startStory() {
    }

}
