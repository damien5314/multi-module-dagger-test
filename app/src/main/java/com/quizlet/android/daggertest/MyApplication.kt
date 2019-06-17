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

    private lateinit var myComponent: MyComponent

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

    override fun onCreate() {
        super.onCreate()
        // Hoping we don't need to do this now-- ActivityInjector should provide everything
        myComponent = buildDaggerGraph()
        myComponent.inject(this)
    }

    private fun buildDaggerGraph(): MyComponent {
        return DaggerMyComponent.builder()
            .build()
    }
}
