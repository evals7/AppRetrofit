package com.example.comunicacionespeticionesproduct.data.remote

import com.example.comunicacionespeticionesproduct.data.model.ProductResponse
import retrofit2.http.GET

interface ProductApi {
    @GET("products") //endpoint relativo
    suspend fun getProducts(): ProductResponse
}