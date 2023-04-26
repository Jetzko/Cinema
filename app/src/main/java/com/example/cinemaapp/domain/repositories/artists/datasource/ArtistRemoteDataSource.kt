package com.example.cinemaapp.domain.repositories.artists.datasource

import com.example.cinemaapp.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}