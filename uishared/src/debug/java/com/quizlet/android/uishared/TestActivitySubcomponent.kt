package com.quizlet.android.uishared

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * TODO documentation
 */
@Subcomponent
interface TestActivitySubcomponent : AndroidInjector<TestActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<TestActivity>
}
