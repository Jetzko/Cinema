package com.example.cinemaapp.domain.repositories.artists.datasourceimpl

import com.example.cinemaapp.data.model.artist.Artist
import com.example.cinemaapp.domain.repositories.artists.datasource.ArtistCacheDataSource

//Set a Cache layer
class ArtistsCacheDataSourceImpl : ArtistCacheDataSource {
    private var artistsList = ArrayList<Artist>()
    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistsList
    }

    override suspend fun saveArtistToCache(artists: List<Artist>) {
        artistsList.clear()
        artistsList = ArrayList(artists)
    }
}