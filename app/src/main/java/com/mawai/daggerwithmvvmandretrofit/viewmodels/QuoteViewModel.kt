package com.mawai.daggerwithmvvmandretrofit.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.mawai.daggerwithmvvmandretrofit.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(private val repository: ProductRepository) : ViewModel(){

    val list = repository.getQuotes().cachedIn(viewModelScope)

}