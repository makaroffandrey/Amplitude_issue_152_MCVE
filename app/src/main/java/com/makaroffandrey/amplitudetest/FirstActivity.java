package com.makaroffandrey.amplitudetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.amplitude.api.Amplitude;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Amplitude.getInstance().logEvent("FirstActivity opened");
        }
        setContentView(R.layout.activity_first);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Amplitude.getInstance().logEvent("FirstActivity button pressed");
                startActivity(new Intent(FirstActivity.this, SecondActivity.class));
            }
        });
    }
}
