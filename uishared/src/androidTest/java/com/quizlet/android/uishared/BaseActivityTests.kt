package com.quizlet.android.uishared

import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BaseActivityTests {

    private fun getActivity(): BaseActivity {
        val activityTestRule = ActivityTestRule(TestActivity::class.java, false, false)
        return activityTestRule.launchActivity(null)
    }

    @Test
    fun launchActivity() {
        val activity = getActivity()
        assertNotNull(activity)
    }
}
