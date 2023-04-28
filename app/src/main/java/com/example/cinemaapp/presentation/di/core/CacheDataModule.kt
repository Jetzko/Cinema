package com.example.cinemaapp.presentation.di.core

import com.example.cinemaapp.domain.repositories.artists.datasource.ArtistCacheDataSource
import com.example.cinemaapp.domain.repositories.artists.datasourceimpl.ArtistsCacheDataSourceImpl
import com.example.cinemaapp.domain.repositories.movies.datasource.MovieCacheDataSource
import com.example.cinemaapp.domain.repositories.movies.datasourceimpl.MovieCacheDataSourceImpl
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvCacheDataSource
import com.example.cinemaapp.domain.repositories.tvshows.datasourceimpl.TvCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource{
        return MovieCacheDataSourceImpl()
    }
    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvCacheDataSource{
        return TvCacheDataSourceImpl()
    }
    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource{
        return ArtistsCacheDataSourceImpl()
    }
}