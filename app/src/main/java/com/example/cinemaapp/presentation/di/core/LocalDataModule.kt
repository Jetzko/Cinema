package com.example.cinemaapp.presentation.di.core


import com.example.cinemaapp.data.db.ArtistDao
import com.example.cinemaapp.data.db.MovieDao
import com.example.cinemaapp.data.db.TvShowDao
import com.example.cinemaapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.cinemaapp.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.example.cinemaapp.data.repository.movie.datasource.MovieLocalDataSource
import com.example.cinemaapp.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.example.cinemaapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.cinemaapp.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }


}