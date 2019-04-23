package com.example.switchcomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//declare the mySwitch variable outside of the @override
        mySwitch = (Switch) findViewById(R.id.switch1);

        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                System.out.println(isChecked);
                if (isChecked == true) {
                    Toast.makeText(MainActivity.this, "the switch is on", Toast.LENGTH_SHORT).show();

                } else if (isChecked == false) {
                    Toast.makeText(MainActivity.this, "the switch is off", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
