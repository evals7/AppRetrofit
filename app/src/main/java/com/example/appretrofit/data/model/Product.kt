package com.example.comunicacionespeticionesproduct.data.model 

data class Product(
    val name: String,
    val description: String,
    val price: String,
    val category: String,
    val image: String,
    val active: Boolean
)