package com.example.appretrofit.presentation

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appretrofit.data.repository.ProductRepository
import com.example.comunicacionespeticionesproduct.data.model.Product
import kotlinx.coroutines.launch


class ProductViewModel : ViewModel() {
    private val productrepository = ProductRepository()

    var productList by mutableStateOf<List<Product>>(emptyList())

    var isLoading by mutableStateOf(true)
        private set

    init {
        fetchProducts()
    }

    private fun fetchProducts() {
        viewModelScope.launch {
            try {
                productList = productrepository.getProducts()
                val products = productrepository.getProducts()
                Log.d("API_PRODUCTS", "Cantidad recibida: ${products.size}")
            } catch (e: Exception) {
                e.printStackTrace()
                Log.e("API_ERROR", e.message ?: "Error desconocido")
            } finally {
                isLoading = false
            }
        }
    }
}