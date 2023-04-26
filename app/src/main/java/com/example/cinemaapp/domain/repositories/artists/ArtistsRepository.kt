package com.example.cinemaapp.domain.repositories.artists

import com.example.cinemaapp.data.model.artist.Artist

interface ArtistsRepository {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}