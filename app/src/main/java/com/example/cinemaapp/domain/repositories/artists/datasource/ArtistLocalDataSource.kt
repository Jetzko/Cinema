package com.example.cinemaapp.domain.repositories.artists.datasource

import com.example.cinemaapp.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB(): List<Artist>
    suspend fun saveArtistsToDB(artists : List<Artist>)
    suspend fun clearAll()
}