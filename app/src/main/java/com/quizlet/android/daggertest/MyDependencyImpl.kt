package com.quizlet.android.daggertest

import com.quizlet.android.uishared.MyDependency
import javax.inject.Inject

class MyDependencyImpl @Inject constructor() : MyDependency {

    override fun calculate(): Int = 42
}
