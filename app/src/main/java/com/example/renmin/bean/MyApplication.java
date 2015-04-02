package com.example.renmin.bean;

import android.app.Application;
import android.util.Log;

/**
 * Created by renmin on 2015/4/2.
 */
public class MyApplication extends Application{
    private static final String TAG = "MyAPP";

    @Override
    public void onCreate(){
        super.onCreate();

        Log.d(TAG,"MyApplication->Oncreate");
    }
}
