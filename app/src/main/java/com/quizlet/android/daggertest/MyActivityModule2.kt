package com.quizlet.android.daggertest

import dagger.Binds
import dagger.Module

/**
 * TODO documentation
 */
@Module
abstract class MyActivityModule2 {

    @Binds
    abstract fun provideMyDependency(impl: MyDependencyImpl): MyDependency
}
