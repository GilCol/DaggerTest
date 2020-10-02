package com.example.daggertest;

import com.example.daggertest.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MyApplication extends DaggerApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        // This calls the methods defined in AppComponent!
        return DaggerAppComponent.builder().application(this).appContext(this).build();
    }
}
