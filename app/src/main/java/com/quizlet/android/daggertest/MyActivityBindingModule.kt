package com.quizlet.android.daggertest

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(
    subcomponents = [
        MyActivitySubcomponent::class
    ]
)
abstract class MyActivityBindingModule {

//    @ActivityScope
//    @ContributesAndroidInjector
//    abstract fun provideActivityInjector(): MyActivity

    @Binds
    @IntoMap
    @ActivityKey(MyActivity::class)
    abstract fun bindActivityInjector(builder: MyActivitySubcomponent.Builder)
            : AndroidInjector.Factory<out Activity>
}
