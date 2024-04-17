package com.lj.data

import retrofit2.Call
import retrofit2.http.GET

interface UserApi {
    @GET
    fun getUsers(): Call<List<UserDto>>
}