package com.byagowi.persiancalendar;

import android.app.Application;

import androidx.multidex.MultiDex;

import com.byagowi.persiancalendar.util.Utils;
/*import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;*/
import com.google.firebase.FirebaseApp;


public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.initUtils(getApplicationContext());
        FirebaseApp.initializeApp(this);
        MultiDex.install(this);

    }
}
