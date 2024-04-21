package com.lj.data

import com.lj.domain.PostRepository
import com.lj.domain.model.Post
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

class PostServiceImpl: PostRepository {

    private val BASE_URL = "https://jsonplaceholder.org"

    private val postApiService: PostApiService

    init {
        val mHttpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        val mOkHttpClient = OkHttpClient
            .Builder()
            .addInterceptor(mHttpLoggingInterceptor)
            .build()

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(mOkHttpClient)
            .build()

        postApiService = retrofit.create(PostApiService::class.java)
    }

    override suspend fun getPosts(): List<Post> {
        return try {
            val response = postApiService.getPosts().awaitResponse()
            if (response.isSuccessful) {
                val posts = response.body() ?: emptyList()
                posts.map { it.toModel() }
            } else {
                emptyList()
            }
        } catch (exception: Exception) {
            val e = exception
            emptyList()
        }
    }
}