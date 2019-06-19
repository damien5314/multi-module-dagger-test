package com.quizlet.android.uishared

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

/**
 * TODO documentation
 */
@Module(
    subcomponents = [
        TestActivitySubcomponent::class
    ]
)
abstract class TestActivityModule {

    @Binds
    @IntoMap
    @ClassKey(TestActivity::class)
    abstract fun bindTestActivityInjectorFactory(factory: TestActivitySubcomponent.Factory)
            : AndroidInjector.Factory<*>
}
