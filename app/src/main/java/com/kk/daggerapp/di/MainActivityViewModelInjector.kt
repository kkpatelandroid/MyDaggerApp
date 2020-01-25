package com.kk.daggerapp.di

import com.kk.daggerapp.viewmodel.MainActivityViewModel
import dagger.Component

@Component
interface MainActivityViewModelInjector {
    fun getMainActivityViewModel(): MainActivityViewModel
}