package com.lj.domain.model

data class Post(
    val id : Int =0,
    val slug: String = "slug",
    val url : String = "url",
    val title : String = "title",
    val content : String = "content",
    val image: String = "image",
    val thumbnail: String = "thumbnail",
    val status: String = "status",
    val category: String = "category",
    val publishedAt: String = "publishedAt",
    val updateAt: String = "updateAt",
    val userId: Int = 0,
)