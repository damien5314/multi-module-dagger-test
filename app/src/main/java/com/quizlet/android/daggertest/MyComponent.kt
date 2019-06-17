package com.quizlet.android.daggertest

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

/**
 * TODO documentation
 */
@Component(
    modules = [
        MyModule::class,
//        ActivityBindingModule::class, // For defining providers in the new DI system
        AndroidSupportInjectionModule::class
    ]
)
interface MyComponent {

    fun inject(application: MyApplication)

    fun inject(activity: MyActivity)
}
