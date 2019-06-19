package com.quizlet.android.uishared

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        TestActivityModule::class
    ]
)
interface TestComponent {

    fun inject(application: TestApplication)
}
