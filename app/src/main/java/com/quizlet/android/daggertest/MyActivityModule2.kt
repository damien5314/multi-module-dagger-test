package com.quizlet.android.daggertest

import dagger.Module
import dagger.Provides

/**
 * TODO documentation
 */
@Module
class MyActivityModule2 {

    @Provides
    fun provideMyDependency(): MyDependency = MyDependencyImpl()
}
