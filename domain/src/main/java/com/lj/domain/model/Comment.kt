package com.lj.domain.model

data class Comment(
    val id: Int,
    val postId: Int,
    val comment: String,
)