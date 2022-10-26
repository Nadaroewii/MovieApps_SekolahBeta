package com.lat1.moviebeta_nada.data

import com.lat1.moviebeta_nada.history.Product
import retrofit2.Response
import retrofit2.http.GET

interface APIServices {

    @GET("/products")
    suspend fun getProductList(): Response<Product>
    @GET("/todos")
    suspend fun getTodosList(): Response<TodosList>

}