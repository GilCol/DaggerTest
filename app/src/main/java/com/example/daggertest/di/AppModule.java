package com.example.daggertest.di;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String providesString() {
        return "random string!";
    }
}
