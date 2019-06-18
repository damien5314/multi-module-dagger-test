package com.quizlet.android.daggertest

import dagger.Module
import dagger.Provides

@Module
abstract class MyActivityModule {

    @Module
    companion object {

        @Provides
        fun provideMyDependency(): MyDependency = MyDependencyImpl()
    }
}
