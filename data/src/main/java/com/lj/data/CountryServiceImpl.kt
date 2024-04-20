package com.lj.data

import com.lj.domain.CountryService
import com.lj.domain.model.Country
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

class CountryServiceImpl: CountryService {

    private val BASE_URL = "https://restcountries.com/v3.1/"

    private val countryApiService: CountryApiService

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

        countryApiService = retrofit.create(CountryApiService::class.java)
    }

    override suspend fun searchCountries(query: String): List<Country> {
        return try {
            val response = countryApiService.searchCountries(query).awaitResponse()
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