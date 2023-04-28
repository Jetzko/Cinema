package com.example.cinemaapp.presentation.di.core

import com.example.cinemaapp.data.api.TMDBService
import com.example.cinemaapp.data.db.TMDBDatabase
import com.example.cinemaapp.domain.repositories.artists.datasource.ArtistRemoteDataSource
import com.example.cinemaapp.domain.repositories.artists.datasourceimpl.ArtistsRemoteDataSourceImpl
import com.example.cinemaapp.domain.repositories.movies.datasource.MovieRemoteDataSource
import com.example.cinemaapp.domain.repositories.movies.datasourceimpl.MovieRemoteDataSourceImpl
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvRemoteDataSource
import com.example.cinemaapp.domain.repositories.tvshows.datasourceimpl.TvRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }
    @Singleton
    @Provides
    fun provideTvShowDataSource(tmdbService: TMDBService): TvRemoteDataSource {
        return TvRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }
    @Singleton
    @Provides
    fun provideArtistDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistsRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }
}