package com.lj.domain

import com.lj.domain.model.Comment

interface CommentRepository {
    suspend fun getComments(): List<Comment>
}