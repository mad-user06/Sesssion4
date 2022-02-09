package com.example.sesssion4.retrofit.api

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sesssion4.retrofit.model.LogIn
import com.example.sesssion4.retrofit.model.Tokeen
import com.example.sesssion4.retrofit.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.http.Body

class MainViewModel (private val repository: Repository): ViewModel() {
    val myResponse : MutableLiveData<Response<Tokeen>> = MutableLiveData()

    fun getLogin(@Body logIn: LogIn){
        viewModelScope.launch {
            val response = repository.getLogin(logIn)
            myResponse.value = response
        }
    }
}