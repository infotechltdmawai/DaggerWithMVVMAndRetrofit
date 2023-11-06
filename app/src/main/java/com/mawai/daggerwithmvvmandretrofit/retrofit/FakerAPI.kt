package com.mawai.daggerwithmvvmandretrofit.retrofit

import com.mawai.daggerwithmvvmandretrofit.models.LoginModel
import com.mawai.daggerwithmvvmandretrofit.models.Product
import com.mawai.daggerwithmvvmandretrofit.models.QuoteList
import com.mawai.daggerwithmvvmandretrofit.response.UnitResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface FakerAPI {

//    @GET("api/Account/unitdetails")
//    suspend fun getProducts(): Response<UnitResponse>

//    @GET("products")
//    suspend fun getProducts(): Response<List<Product>>

    @GET("quotes")
    suspend fun getQuotes(@Query("page") page: Int): QuoteList

//    @Headers("Content-Type: application/json", "Accept: application/json")
//    @POST("api/Account/login")
//    suspend fun getLogin(@Body model: LoginModel?): Response<UnitResponse?>?




}