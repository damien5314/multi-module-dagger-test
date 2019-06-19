package com.quizlet.android.uishared

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class TestApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Any>

    private lateinit var myAppComponent: TestComponent

    override fun androidInjector(): AndroidInjector<Any> {
        return activityInjector
    }

    override fun onCreate() {
        super.onCreate()
        myAppComponent = buildDaggerGraph()
        myAppComponent.inject(this)
    }

    private fun buildDaggerGraph(): TestComponent {
        return DaggerTestComponent.create()
    }
}
