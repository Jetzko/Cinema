package com.example.cinemaapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cinemaapp.data.model.movie.Movie

@Dao
interface MovieDao {
    //Replace Movies
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies : List<Movie>)

    //Delete Movies
    @Query("DELETE FROM popular_movies")
    suspend fun deleteAllMovies()

    //Get Movies
    @Query("SELECT * FROM popular_movies")
    suspend fun getMovies(): List<Movie>
}