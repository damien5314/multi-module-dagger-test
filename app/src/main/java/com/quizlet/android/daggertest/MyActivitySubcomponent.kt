package com.quizlet.android.daggertest

import dagger.Subcomponent
import dagger.android.AndroidInjector

@ActivityScope
@Subcomponent
interface MyActivitySubcomponent : AndroidInjector<MyActivity> {

    @Subcomponent.Builder
    abstract class Builder : MyActivitySubcomponentBuilder()
}
