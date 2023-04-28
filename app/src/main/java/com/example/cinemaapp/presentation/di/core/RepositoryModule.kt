package com.example.cinemaapp.presentation.di.core

import com.example.cinemaapp.domain.repositories.artists.ArtistsRepository
import com.example.cinemaapp.domain.repositories.artists.datasource.ArtistCacheDataSource
import com.example.cinemaapp.domain.repositories.artists.datasource.ArtistLocalDataSource
import com.example.cinemaapp.domain.repositories.artists.datasource.ArtistRemoteDataSource
import com.example.cinemaapp.domain.repositories.artists.datasourceimpl.ArtistsRepositoryImpl
import com.example.cinemaapp.domain.repositories.movies.MovieRepository
import com.example.cinemaapp.domain.repositories.movies.datasource.MovieCacheDataSource
import com.example.cinemaapp.domain.repositories.movies.datasource.MovieLocalDataSource
import com.example.cinemaapp.domain.repositories.movies.datasource.MovieRemoteDataSource
import com.example.cinemaapp.domain.repositories.movies.datasourceimpl.MovieRepositoryImpl
import com.example.cinemaapp.domain.repositories.tvshows.TvShowRepository
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvCacheDataSource
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvLocaleDataSource
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvRemoteDataSource
import com.example.cinemaapp.domain.repositories.tvshows.datasourceimpl.TvShowRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }
    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvRemoteDataSource: TvRemoteDataSource,
        tvLocaleDataSource: TvLocaleDataSource,
        tvCacheDataSource: TvCacheDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(
            tvRemoteDataSource,
            tvLocaleDataSource,
            tvCacheDataSource
        )
    }
    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistsRepository {
        return ArtistsRepositoryImpl(
            artistRemoteDataSource,
            artistLocalDataSource,
            artistCacheDataSource
        )
    }
}