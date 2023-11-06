package com.mawai.daggerwithmvvmandretrofit.di

import com.mawai.daggerwithmvvmandretrofit.retrofit.FakerAPI
import com.mawai.daggerwithmvvmandretrofit.uttils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun getRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client: OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .retryOnConnectionFailure(true)
            .connectTimeout(1000, TimeUnit.SECONDS)
            .readTimeout(1000, TimeUnit.SECONDS)
            .build()
        return Retrofit.Builder().
        baseUrl(Constants.BASE_URL).
        client(client).
        addConverterFactory(GsonConverterFactory.create()).
        build()
    }

//    @Singleton
//    @Provides
//    fun providesFakerAPI(retrofit: Retrofit) : FakerAPI{
//        return retrofit.create(FakerAPI::class.java)
//    }

    @Singleton
    @Provides
    fun getQuoteAPI(retrofit: Retrofit) : FakerAPI{
        return retrofit.create(FakerAPI::class.java)
    }
}