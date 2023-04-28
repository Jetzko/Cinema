package com.example.cinemaapp.presentation.di.core

import com.example.cinemaapp.data.db.ArtistsDao
import com.example.cinemaapp.data.db.MovieDao
import com.example.cinemaapp.data.db.TvShowsDao
import com.example.cinemaapp.domain.repositories.artists.datasource.ArtistLocalDataSource
import com.example.cinemaapp.domain.repositories.artists.datasourceimpl.ArtistsLocalDataSourceImpl
import com.example.cinemaapp.domain.repositories.movies.datasource.MovieLocalDataSource
import com.example.cinemaapp.domain.repositories.movies.datasourceimpl.MovieLocalDataSourceImpl
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvLocaleDataSource
import com.example.cinemaapp.domain.repositories.tvshows.datasourceimpl.TvLocaleDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao) : MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }
    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowsDao: TvShowsDao) : TvLocaleDataSource{
        return TvLocaleDataSourceImpl(tvShowsDao)
    }
    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistsDao: ArtistsDao) : ArtistLocalDataSource{
        return ArtistsLocalDataSourceImpl(artistsDao)
    }
}