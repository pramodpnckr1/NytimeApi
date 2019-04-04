package com.nytimes.articles.di.builder;

import com.nytimes.articles.view.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * The module which provides the android injection service to Activities.
 * Author: PRAMOD K P
 * Email: pramodpnckr@gmail.com
 * Created: 3/28/2019
 * Modified: 3/28/2019
 */
@Module
public abstract class ActivityBuilderModule {

    @SuppressWarnings("unused")
    @ContributesAndroidInjector(modules = FragmentBuilderModule.class)
    abstract MainActivity mainActivity();


}
