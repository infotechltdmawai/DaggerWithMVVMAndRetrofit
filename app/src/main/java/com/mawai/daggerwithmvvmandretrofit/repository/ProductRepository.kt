package com.mawai.daggerwithmvvmandretrofit.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.mawai.daggerwithmvvmandretrofit.models.LoginModel
import com.mawai.daggerwithmvvmandretrofit.models.Product
import com.mawai.daggerwithmvvmandretrofit.paging.QuotePagingSource
import com.mawai.daggerwithmvvmandretrofit.response.UnitResponse
import com.mawai.daggerwithmvvmandretrofit.retrofit.FakerAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI) {

    fun getQuotes() = Pager(
        config = PagingConfig(pageSize = 20, maxSize = 100),
        pagingSourceFactory = {QuotePagingSource(fakerAPI)}
    ).liveData
//
    private val _products = MutableLiveData<List<Product>>()
    val products : LiveData<List<Product>>
    get() = _products
//
////    private val _products = MutableLiveData<UnitResponse>()
////    val products : LiveData<UnitResponse>
////    get() = _products
//
////    private val _login = MutableLiveData<UnitResponse>()
////    val login : LiveData<UnitResponse>
////    get() = _login
//
//    suspend fun getProducts(){
//        val result = fakerAPI.getProducts()
//        if (result.isSuccessful && result.body() != null){
//            _products.postValue(result.body())
//        }
//    }

//    suspend fun getLogin(loginModel: LoginModel){
//        val result = fakerAPI.getLogin(loginModel)
//        if (result != null) {
//            if (result.isSuccessful && result.body() != null){
//                _login.postValue(result.body())
//            }
//        }
//    }



}