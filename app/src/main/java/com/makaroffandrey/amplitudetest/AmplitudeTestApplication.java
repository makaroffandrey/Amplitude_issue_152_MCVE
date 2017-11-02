package com.makaroffandrey.amplitudetest;

import android.app.Application;
import android.util.Log;

import com.amplitude.api.Amplitude;

public class AmplitudeTestApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Amplitude.getInstance().initialize(this, BuildConfig.AMPLITUDE_KEY).enableForegroundTracking(this).enableLogging(true).setLogLevel(Log.VERBOSE);
    }
}