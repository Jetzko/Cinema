package com.example.cinemaapp.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.example.cinemaapp.data.db.ArtistsDao
import com.example.cinemaapp.data.db.MovieDao
import com.example.cinemaapp.data.db.TMDBDatabase
import com.example.cinemaapp.data.db.TvShowsDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {
    @Singleton
    @Provides
    fun provideMovieDataBase(context: Context): TMDBDatabase {
        return Room.databaseBuilder(context, TMDBDatabase::class.java, "tmdbClient")
            .build()
    }
    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase): MovieDao{
        return tmdbDatabase.movieDao()
    }
    @Singleton
    @Provides
    fun provideTvShowDao(tmdbDatabase: TMDBDatabase): TvShowsDao{
        return tmdbDatabase.tvDao()
    }
    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase): ArtistsDao{
        return tmdbDatabase.artistDao()
    }
}