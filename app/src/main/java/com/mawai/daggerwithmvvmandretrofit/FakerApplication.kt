package com.mawai.daggerwithmvvmandretrofit
//
//import android.app.Application
//import com.mawai.daggerwithmvvmandretrofit.di.ApplicationComponent
//import com.mawai.daggerwithmvvmandretrofit.di.DaggerApplicationComponent
//
//class FakerApplication : Application(){
//
//    lateinit var applicationComponent: ApplicationComponent
//
//    override fun onCreate() {
//        super.onCreate()
//
//        applicationComponent = DaggerApplicationComponent.builder().build()
//    }
//}