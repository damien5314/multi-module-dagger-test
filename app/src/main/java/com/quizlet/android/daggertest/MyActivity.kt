package com.quizlet.android.daggertest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection

class MyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}
