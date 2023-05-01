package com.example.cinemaapp.domain.repository

import com.example.cinemaapp.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}