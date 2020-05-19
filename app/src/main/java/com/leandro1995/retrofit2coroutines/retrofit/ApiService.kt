package com.leandro1995.retrofit2coroutines.retrofit

import com.google.gson.JsonArray
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun userList(): Response<JsonArray>
}