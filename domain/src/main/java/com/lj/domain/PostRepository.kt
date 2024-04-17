package com.lj.domain

import com.lj.domain.model.Post

interface PostRepository {
    suspend fun getPosts(): List<Post>
}