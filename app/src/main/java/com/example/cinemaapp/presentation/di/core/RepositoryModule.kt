package com.example.cinemaapp.presentation.di.core


import com.example.cinemaapp.data.repository.artist.ArtistRepositoryImpl
import com.example.cinemaapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.cinemaapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.cinemaapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.example.cinemaapp.data.repository.movie.MovieRepositoryImpl
import com.example.cinemaapp.data.repository.movie.datasource.MovieCacheDataSource
import com.example.cinemaapp.data.repository.movie.datasource.MovieLocalDataSource
import com.example.cinemaapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.cinemaapp.data.repository.tvshow.TvShowRepositoryImpl
import com.example.cinemaapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.cinemaapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.cinemaapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.cinemaapp.domain.repository.ArtistRepository
import com.example.cinemaapp.domain.repository.MovieRepository
import com.example.cinemaapp.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}