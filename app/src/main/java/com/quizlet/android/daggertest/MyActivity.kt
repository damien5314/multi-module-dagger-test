package com.quizlet.android.daggertest

import android.os.Bundle
import android.widget.Toast
import com.quizlet.android.uishared.BaseActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class MyActivity : BaseActivity() {

    @Inject
    lateinit var myDependency: MyDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        showUi()
    }

    private fun showUi() {
        val result = myDependency.calculate()
        Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
    }
}
