package com.example.comunicacionespeticionesproduct.data.repository

import com.example.comunicacionespeticionesproduct.data.model.Product
import com.example.comunicacionespeticionesproduct.data.remote.RetrofitInstance

class ProductRepository {
    suspend fun getProducts(): List<Product>{
        return RetrofitInstance.api.getProducts().results
    }
}