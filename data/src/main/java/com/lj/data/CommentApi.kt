package com.lj.data

import retrofit2.Call
import retrofit2.http.GET

interface CommentApi {
    @GET
    fun getComments(): Call<List<CommentDto>>
}