package com.example.cinemaapp.domain.repositories.artists.datasource

import com.example.cinemaapp.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistToCache(artists : List<Artist>)
}