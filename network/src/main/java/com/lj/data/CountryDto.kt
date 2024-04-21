package com.lj.data

import com.google.gson.annotations.SerializedName
import com.lj.domain.model.Country

data class CountryDTO(
    @SerializedName("name")
    val name: Name,
    @SerializedName("region")
    val region: String,
    @SerializedName("area")
    val area: Double,
    @SerializedName("population")
    val population: Int
)

data class Name(
    @SerializedName("common")
    val common: String
)

fun CountryDTO.toModel() = Country(
    name = this.name.common,
    region = this.region,
    area = this.area,
    population = this.population
)