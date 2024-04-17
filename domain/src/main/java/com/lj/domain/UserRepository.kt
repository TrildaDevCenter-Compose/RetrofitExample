package com.lj.domain

import com.lj.domain.model.User

interface UserRepository {
    suspend fun getUsers(): List<User>
}