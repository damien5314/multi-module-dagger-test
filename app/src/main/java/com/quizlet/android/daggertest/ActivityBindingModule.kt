package com.quizlet.android.daggertest

import dagger.Module

@Module(
    includes = [
        MyActivityBindingModule::class
    ],
    subcomponents = []
)
abstract class ActivityBindingModule
