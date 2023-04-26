package com.example.cinemaapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cinemaapp.data.model.artist.Artist
import com.example.cinemaapp.data.model.movie.Movie
import com.example.cinemaapp.data.model.tvshow.TvShow

@Database(
    entities = [Movie::class, TvShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TvShowsDao
    abstract fun artistDao(): ArtistsDao
}