package com.example.cinemaapp.data.repository.artist.datasourceImpl



import com.example.cinemaapp.data.api.TMDBService
import com.example.cinemaapp.data.model.artist.ArtistList
import com.example.cinemaapp.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

