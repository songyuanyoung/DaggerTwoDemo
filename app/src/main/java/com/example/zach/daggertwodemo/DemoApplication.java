package com.example.zach.daggertwodemo;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

/**
 * Created by v766995 on 3/20/2018.
 */

public class DemoApplication extends Application {
    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }
    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
