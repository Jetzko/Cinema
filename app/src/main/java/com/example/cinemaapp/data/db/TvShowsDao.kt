package com.example.cinemaapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cinemaapp.data.model.tvshow.TvShow

@Dao
interface TvShowsDao {
    //Replace TvShows
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShows(tvshows : List<TvShow>)

    //Delete all TvShows
    @Query("DELETE  FROM popular_tvShow")
    suspend fun deleteAllTvShows()

    //Get TvShows
    @Query("SELECT * FROM popular_tvShow")
    suspend fun getTvShows(): List<TvShow>

}