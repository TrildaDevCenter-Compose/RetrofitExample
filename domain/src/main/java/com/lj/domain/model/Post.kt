package com.lj.domain.model

data class Post(
    val id : Int,
    val slug: String,
    val url : String,
    val title : String,
    val content : String,
    val image: String,
    val thumbnail: String,
    val status: String,
    val category: String,
    val publishedAt: String,
    val updateAt: String,
    val userId: Int,
)