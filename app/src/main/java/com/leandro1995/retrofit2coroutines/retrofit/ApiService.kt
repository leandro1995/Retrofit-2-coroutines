package com.leandro1995.retrofit2coroutines.retrofit

import com.google.gson.JsonArray
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun userList() : Call<JsonArray>
}