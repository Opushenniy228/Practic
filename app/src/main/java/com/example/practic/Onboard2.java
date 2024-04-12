package com.example.practic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.os.Bundle;

public class Onboard2 extends AppCompatActivity {

    ImageButton skipbutton;

    ImageButton nextbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard2);

        nextbutton = (ImageButton) findViewById(R.id.imageButton2);

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboard2.this, Onboard3.class);
                startActivities(new Intent[]{intent});
            }
        });

        skipbutton = (ImageButton) findViewById(R.id.imageButton);

        skipbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboard2.this, Onboard3.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}