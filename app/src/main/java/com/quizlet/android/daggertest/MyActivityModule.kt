package com.quizlet.android.daggertest

import com.quizlet.android.uishared.MyDependency
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(
    subcomponents = [
        MyActivitySubcomponent::class
    ]
)
abstract class MyActivityModule {

    @Binds
    @IntoMap
    @ClassKey(MyActivity::class)
    abstract fun bindMyActivityInjectorFactory(factory: MyActivitySubcomponent.Factory)
            : AndroidInjector.Factory<*>

    // TODO: Move this to a module in uishared
    @Binds
    abstract fun provideMyDependency(impl: MyDependencyImpl): MyDependency
}
