package com.lj.domain.model

data class User(
    val id: Int,
    val firstname: String,
    val lastname: String,
    val email: String,
    val birthdate: String,
    val login: Login,
    val address: Address,
    val phone: String,
    val website: Double,
    val company: Company
)
data class Login(
    val uuid: String,
    val username: String,
    val password: String,
    val md5: String,
    val sha1: String,
    val registered: String
)

data class Address(
    val street: String,
    val suite: String,
    val city: String,
    val zipcode: String,
    val geo: Geo
)

data class Geo(
    val lat: String,
    val lng: String,
)

data class Company(
    val name: String,
    val catchPhrase: String,
    val bs: String
)