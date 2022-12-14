package com.philipademba.takehome.di.modules.movies

import com.philipademba.takehome.data.services.movie.MovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppNetworkModule {

    @Provides
    @Singleton
    fun provideMoviesApi(retrofit: Retrofit): MovieService = retrofit.create(MovieService::class.java)

}