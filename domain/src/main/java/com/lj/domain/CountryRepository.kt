package com.lj.domain

import com.lj.domain.model.Country

interface CountryRepository {
    suspend fun searchCountries(query: String): List<Country>
}