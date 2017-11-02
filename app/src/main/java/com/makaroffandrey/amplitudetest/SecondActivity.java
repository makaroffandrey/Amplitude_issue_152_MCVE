package com.makaroffandrey.amplitudetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.amplitude.api.Amplitude;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Amplitude.getInstance().logEvent("SecondActivity opened");
        setContentView(R.layout.activity_second);
    }
}
