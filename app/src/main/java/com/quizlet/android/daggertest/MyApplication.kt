package com.quizlet.android.daggertest

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MyApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    private lateinit var myAppComponent: MyAppComponent

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

    override fun onCreate() {
        super.onCreate()
        myAppComponent = buildDaggerGraph()
        myAppComponent.inject(this)
    }

    private fun buildDaggerGraph(): MyAppComponent {
        return DaggerMyAppComponent.create()
    }
}
