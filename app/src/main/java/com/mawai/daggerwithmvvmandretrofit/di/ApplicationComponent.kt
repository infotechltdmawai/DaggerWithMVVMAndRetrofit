package com.mawai.daggerwithmvvmandretrofit.di

import androidx.lifecycle.ViewModel
import com.mawai.daggerwithmvvmandretrofit.MainActivity
import dagger.Component
import dagger.multibindings.ClassKey
import javax.inject.Singleton

//@Singleton
//@Component(modules = [NetworkModule::class,ViewModelModule::class])
//interface ApplicationComponent {
//
//    fun inject(mainActivity: MainActivity)
//
////    fun getMap() : Map<String,ViewModel>
//    fun getMap() : Map<Class<*>,ViewModel>
//}