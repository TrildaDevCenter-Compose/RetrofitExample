package com.lj.data

import com.google.gson.annotations.SerializedName
import com.lj.domain.model.Address
import com.lj.domain.model.Company
import com.lj.domain.model.Login
import com.lj.domain.model.User

data class UserDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("firstname")
    val firstname: String,
    @SerializedName("lastname")
    val lastname: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("birthdate")
    val birthdate: String,
    @SerializedName("login")
    val login: Login,
    @SerializedName("address")
    val address: Address,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("website")
    val website: Double,
    @SerializedName("company")
    val company: Company
)

data class Login(
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("md5")
    val md5: String,
    @SerializedName("sha1")
    val sha1: String,
    @SerializedName("registered")
    val registered: String
)

data class Address(
    @SerializedName("street")
    val street: String,
    @SerializedName("suite")
    val suite: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("zipcode")
    val zipcode: String,
    @SerializedName("geo")
    val geo: Geo
)

data class Geo(
    @SerializedName("lat")
    val lat: String,
    @SerializedName("lng")
    val lng: String,
)

fun UserDto.toModel() = User(
     id = this.id,
     firstname = this.firstname,
     lastname = this.lastname,
     email = this.email,
     birthdate = this.birthdate ,
     login = this.login,
     address = this.address,
     phone = this.phone,
     website = this.website,
     company = this.company
)