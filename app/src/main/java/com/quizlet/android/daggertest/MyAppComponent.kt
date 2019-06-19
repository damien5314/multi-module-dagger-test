package com.quizlet.android.daggertest

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        MyActivityModule::class
    ]
)
interface MyAppComponent {

    fun inject(application: MyApplication)
}
