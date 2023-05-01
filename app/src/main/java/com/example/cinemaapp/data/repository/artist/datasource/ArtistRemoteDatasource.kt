package com.example.cinemaapp.data.repository.artist.datasource


import com.example.cinemaapp.data.model.artist.ArtistList

import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}