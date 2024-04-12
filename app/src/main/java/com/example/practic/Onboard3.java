package com.example.practic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.os.Bundle;

public class Onboard3 extends AppCompatActivity {

    ImageButton signupbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard3);

        signupbutton = (ImageButton) findViewById(R.id.imageButton3);

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboard3.this, SignUp.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}