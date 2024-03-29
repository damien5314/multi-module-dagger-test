package com.quizlet.android.daggertest

import com.quizlet.android.uishared.ActivityScope
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ActivityScope
@Subcomponent(
    modules = [
    ]
)
interface MyActivitySubcomponent : AndroidInjector<MyActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MyActivity>
}
