package com.example.zach.daggertwodemo;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by v766995 on 3/20/2018.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();
    Application getApplication();
    DataManager getDataManager();
    SharedPrefsHelper getPreferenceHelper();
    DbHelper getDbHelper();
}
