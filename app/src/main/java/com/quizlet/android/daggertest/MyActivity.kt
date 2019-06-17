package com.quizlet.android.daggertest

import android.os.Bundle
import dagger.android.AndroidInjection

class MyActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}
