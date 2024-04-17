package com.lj.data

import com.lj.domain.UserRepository
import com.lj.domain.model.User
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

class UserRepositoryImpl: UserRepository {

    private val BASE_URL = "https://jsonplaceholder.org/user"

    private val userApi: UserApi

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

        userApi = retrofit.create(UserApi::class.java)
    }

    override suspend fun getUsers(): List<User> {
        return try {
            val response = userApi.getUsers().awaitResponse()
            if (response.isSuccessful) {
                val users = response.body() ?: emptyList()
                users.map { it.toModel() }
            } else {
                emptyList()
            }
        } catch (exception: Exception) {
            val e = exception
            emptyList()
        }
    }

}