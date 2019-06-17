package com.quizlet.android.daggertest

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MyActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun provideActivityInjector(): MyActivity
}
