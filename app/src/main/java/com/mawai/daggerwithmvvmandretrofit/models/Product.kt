package com.mawai.daggerwithmvvmandretrofit.models

import androidx.room.Entity

@Entity
data class Product(
    val category: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: Double,
    val title: String
)