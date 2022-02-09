package com.example.sesssion4.retrofit.service

import com.example.sesssion4.retrofit.model.LogIn
import com.example.sesssion4.retrofit.model.Tokeen
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface Interface {
    @POST("auth/login")
    suspend fun getLogin(@Body logIn: LogIn) : Response<Tokeen>
}