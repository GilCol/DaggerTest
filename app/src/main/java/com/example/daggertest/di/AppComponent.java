package com.example.daggertest.di;

import android.app.Application;
import android.content.Context;

import com.example.daggertest.MyApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import gil.com.feature.di.FeatureComponent;
import gil.com.feature.di.FeatureModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityBuildersModule.class,
        AppModule.class,
        FeatureModule.class
})
public interface AppComponent extends AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        @BindsInstance
        Builder appContext(Context context);

        AppComponent build();
    }

    FeatureComponent.Factory factoryComponent();
}
