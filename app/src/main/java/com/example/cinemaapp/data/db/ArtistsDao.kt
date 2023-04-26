package com.example.cinemaapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cinemaapp.data.model.artist.Artist


    @Dao
    interface ArtistsDao {
        //Replace Artists
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun saveArtists(artists : List<Artist>)

        //Delete all Artists
        @Query("DELETE FROM popular_artists")
        suspend fun deleteAllArtists()

        //Get Artists
        @Query("SELECT * FROM popular_artists")
        suspend fun getArtists(): List<Artist>

    }