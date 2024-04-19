package com.lj.data

import com.lj.domain.CommentRepository
import com.lj.domain.CountryRepository
import com.lj.domain.model.Comment
import com.lj.domain.model.Country
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

class CommentRepositoryImpl: CommentRepository {

    private val BASE_URL = "https://jsonplaceholder.org/"

    private val commentApi: CommentApi

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

        commentApi = retrofit.create(CommentApi::class.java)
    }

    override suspend fun getComments(): List<Comment> {
        return try {
            val response = commentApi.getComments().awaitResponse()
            if (response.isSuccessful) {
                val countries = response.body() ?: emptyList()
                countries.map { it.toModel() }
            } else {
                emptyList()
            }
        } catch (exception: Exception) {
            val e = exception
            emptyList()
        }
    }
}