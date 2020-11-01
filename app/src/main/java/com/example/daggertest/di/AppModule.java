package com.example.daggertest.di;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class AppModule {

    @Provides
    static String providesString() {
        return "Provided app module string!";
    }
}
