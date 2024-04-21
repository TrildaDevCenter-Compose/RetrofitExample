package com.lj.data

import retrofit2.Call
import retrofit2.http.GET

interface PostApiService {
    @GET("posts")
    fun getPosts(): Call<List<PostDto>>
}