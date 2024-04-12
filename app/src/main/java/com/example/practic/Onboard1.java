package com.example.practic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.os.Bundle;

public class Onboard1 extends AppCompatActivity {

   ImageButton skipbutton;
   ImageButton nextbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard1);

        nextbutton = (ImageButton) findViewById(R.id.imageButton4);

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboard1.this, Onboard2.class);
                startActivities(new Intent[]{intent});
            }
        });

       skipbutton = (ImageButton) findViewById(R.id.imageButton5);

        skipbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboard1.this, Onboard3.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}
