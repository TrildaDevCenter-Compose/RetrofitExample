package com.lj.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CountryApiService {
    @GET("name/{countryName}")
    fun searchCountries(@Path("countryName") countryName: String): Call<List<CountryDTO>>
}