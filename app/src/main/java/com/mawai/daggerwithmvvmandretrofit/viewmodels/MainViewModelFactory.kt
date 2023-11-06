package com.mawai.daggerwithmvvmandretrofit.viewmodels

//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import com.mawai.daggerwithmvvmandretrofit.repository.ProductRepository
//import javax.inject.Inject

//class MainViewModelFactory @Inject constructor(private val repository: ProductRepository,
//                                               private val randomize: Randomize) : ViewModelProvider.Factory{
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return MainViewModel(repository,randomize) as T
//    }
//}

//class MainViewModelFactory @Inject constructor(private val map:Map<Class<*>,@JvmSuppressWildcards ViewModel>) : ViewModelProvider.Factory{
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return map[modelClass] as T
//    }
//}

//class MainViewModelFactory @Inject constructor(private val mainViewModel: MainViewModel) : ViewModelProvider.Factory{
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return mainViewModel as T
//    }
//}