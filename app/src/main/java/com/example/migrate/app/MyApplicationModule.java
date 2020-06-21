package com.example.migrate.app;

import com.example.migrate.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeAcitivityInjector();
}
