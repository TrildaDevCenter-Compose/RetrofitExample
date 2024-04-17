package com.lj.data

import com.google.gson.annotations.SerializedName
import com.lj.domain.model.Post

data class PostDto(
    @SerializedName("id")
    val id : Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("url")
    val url : String,
    @SerializedName("title")
    val title : String,
    @SerializedName("content")
    val content : String,
    @SerializedName("image")
    val image: String,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("category")
    val category: String,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("updateAt")
    val updateAt: String,
    @SerializedName("userId")
    val userId: Int,
)

fun PostDto.toModel() = Post(
    id = this.id,
    slug = this.slug,
    url = this.url,
    title = this.title,
    content = this.image,
    image = this.image,
    thumbnail = this.thumbnail,
    status = this.status,
    category = this.category,
    publishedAt = this.publishedAt,
    updateAt = this.updateAt,
    userId = this.userId
)