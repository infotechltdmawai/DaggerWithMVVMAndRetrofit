package com.mawai.daggerwithmvvmandretrofit.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mawai.daggerwithmvvmandretrofit.models.LoginModel
import com.mawai.daggerwithmvvmandretrofit.models.Product
import com.mawai.daggerwithmvvmandretrofit.response.UnitResponse
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


//class MainViewModel @Inject constructor(val repository: ProductRepository,
//                                        val randomize: Randomize): ViewModel() {

//    val productLiveData : LiveData<UnitResponse>
//    get() = repository.products

//    val productLiveData : LiveData<List<Product>>
//    get() = repository.products

//    private val loginLiveData : LiveData<UnitResponse>
//    get() = repository.login

//    init {
//        viewModelScope.launch(Dispatchers.IO) {
//            repository.getProducts()
////            val user = LoginModel("10001","ADMIN","123")
////            repository.getLogin(user)
//        }
//    }

//    fun callGetLoginDetail(loginModel: LoginModel?): LiveData<UnitResponse> {
//        viewModelScope.launch {
//            if (loginModel != null) {
//                repository.getLogin(loginModel)
//            }
//        }
//        return loginLiveData
//    }

//    fun makeLogin(unitcode: String, userid: String, password: String) {
//         viewModelScope.launch {
//             val usr = LoginModel(unitcode,userid, password)
//             repository.getLogin(usr)
//         }
//    }


//}
//
//class Randomize @Inject constructor(){
//    fun doAction(){
//        Log.d("Ayush","Random Action")
//    }
//}
