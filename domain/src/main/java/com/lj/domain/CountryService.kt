package com.lj.domain

import com.lj.domain.model.Country

interface CountryService {
    suspend fun searchCountries(query: String): List<Country>
}