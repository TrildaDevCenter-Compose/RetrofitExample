package com.lj.data.di

import com.lj.data.CommentRepositoryImpl
import com.lj.data.CountryRepositoryImpl
import com.lj.data.PostRepositoryImpl
import com.lj.data.UserRepositoryImpl
import com.lj.domain.CommentRepository
import com.lj.domain.CountryRepository
import com.lj.domain.PostRepository
import com.lj.domain.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Module to inject/provide repositories.
 */
@InstallIn(SingletonComponent::class)
@Module
object Module {

    @Provides
    fun provideCountryRepository(): CountryRepository {
        return CountryRepositoryImpl()
    }

    @Provides
    fun provideUserRepository(): UserRepository {
        return UserRepositoryImpl()
    }

    @Provides
    fun providePostRepository(): PostRepository {
        return PostRepositoryImpl()
    }

    @Provides
    fun provideCommentRepository(): CommentRepository {
        return CommentRepositoryImpl()
    }
}