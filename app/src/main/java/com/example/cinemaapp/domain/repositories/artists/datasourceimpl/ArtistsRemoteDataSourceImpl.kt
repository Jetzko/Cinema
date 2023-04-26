package com.example.cinemaapp.domain.repositories.artists.datasourceimpl

import androidx.room.PrimaryKey
import com.example.cinemaapp.data.api.TMDBService
import com.example.cinemaapp.data.model.artist.ArtistList
import com.example.cinemaapp.domain.repositories.artists.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistsRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : ArtistRemoteDataSource{
    override suspend fun getArtists(): Response<ArtistList> {
       return tmdbService.getPopularArtists(apiKey)
    }


}