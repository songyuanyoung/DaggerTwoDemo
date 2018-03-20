package com.example.zach.daggertwodemo;

import dagger.Component;

/**
 * Created by v766995 on 3/20/2018.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
