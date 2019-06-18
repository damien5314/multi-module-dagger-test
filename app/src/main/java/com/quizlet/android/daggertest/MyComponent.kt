package com.quizlet.android.daggertest

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

/**
 * TODO documentation
 */
@Component(
    modules = [
        MyModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface MyComponent {

    fun inject(application: MyApplication)
}
