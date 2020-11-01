package com.example.daggertest;

import com.example.daggertest.di.AppComponent;
import com.example.daggertest.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import gil.com.feature.di.FeatureComponent;
import gil.com.feature.di.FeatureComponentProvider;

public class MyApplication extends DaggerApplication implements FeatureComponentProvider {

    AppComponent appComponent = DaggerAppComponent.builder()
            .application(this)
            .appContext(this)
            .build();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        // This calls the methods defined in AppComponent!
        return appComponent;
    }

    @Override
    public FeatureComponent provideFeatureComponent() {
        return appComponent.factoryComponent().create();
    }
}
