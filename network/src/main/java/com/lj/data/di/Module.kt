package com.lj.data.di

import com.lj.data.CommentRepositoryImpl
import com.lj.data.CountryServiceImpl
import com.lj.data.PostServiceImpl
import com.lj.data.UserRepositoryImpl
import com.lj.domain.CommentRepository
import com.lj.domain.CountryService
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
    fun provideCountryRepository(): CountryService {
        return CountryServiceImpl()
    }

    @Provides
    fun provideUserRepository(): UserRepository {
        return UserRepositoryImpl()
    }

    @Provides
    fun providePostRepository(): PostRepository {
        return PostServiceImpl()
    }

    @Provides
    fun provideCommentRepository(): CommentRepository {
        return CommentRepositoryImpl()
    }
}