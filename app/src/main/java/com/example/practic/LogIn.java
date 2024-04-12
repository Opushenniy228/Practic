package com.example.practic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.os.Bundle;

public class LogIn extends AppCompatActivity {

    ImageButton logintohome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        logintohome = (ImageButton) findViewById(R.id.imageButton6);

        logintohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this, HomeActivity.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}