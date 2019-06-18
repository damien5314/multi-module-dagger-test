package com.quizlet.android.daggertest

import dagger.android.AndroidInjector

abstract class MyActivitySubcomponentBuilder : AndroidInjector.Builder<MyActivity>() {

    override fun seedInstance(instance: MyActivity) {
    }
}
