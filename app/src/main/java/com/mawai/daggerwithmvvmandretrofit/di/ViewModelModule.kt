package com.mawai.daggerwithmvvmandretrofit.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
//
//@Module
//abstract class ViewModelModule {
//
//    @Binds
////    @StringKey("mainViewModel")
//    @ClassKey(MainViewModel::class)
//    @IntoMap
//    abstract fun mainViewModel(mainViewModel: MainViewModel): ViewModel
//
//    @Binds
////    @StringKey("mainViewModel2")
//    @ClassKey(MainViewModel2::class)
//    @IntoMap
//    abstract fun mainViewModel2(mainViewModel2: MainViewModel2): ViewModel
//}