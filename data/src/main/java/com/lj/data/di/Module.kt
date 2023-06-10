package com.lj.data.di

import com.lj.data.CountryRepositoryImpl
import com.lj.domain.CountryRepository
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
}