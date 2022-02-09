package com.example.sesssion4.retrofit.repository

import com.example.sesssion4.retrofit.model.LogIn
import com.example.sesssion4.retrofit.model.Tokeen
import com.example.sesssion4.retrofit.service.Instance
import retrofit2.Response
import retrofit2.http.Body

class Repository {
    suspend fun getLogin(@Body logIn: LogIn): Response<Tokeen> {
        return Instance.apiServ.getLogin(logIn)
    }
}