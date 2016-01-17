package com.example.gmailquickstart;

import android.app.Application;
import android.content.Context;
//import android.support.multidex.MultiDex;

/**
 * Created by Irina on 1/15/2016.
 */
public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        //MultiDex.install(this);
        super.onCreate();
    }
}
