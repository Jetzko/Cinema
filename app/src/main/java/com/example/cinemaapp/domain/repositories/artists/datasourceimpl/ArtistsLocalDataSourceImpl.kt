package com.example.cinemaapp.domain.repositories.artists.datasourceimpl

import com.example.cinemaapp.data.db.ArtistsDao
import com.example.cinemaapp.data.model.artist.Artist
import com.example.cinemaapp.domain.repositories.artists.datasource.ArtistLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistsLocalDataSourceImpl(private val artistsDao: ArtistsDao) : ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> {
        return artistsDao.getArtists()
    }

    override suspend fun saveArtistsToDB(artists: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistsDao.saveArtists(artists)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            artistsDao.deleteAllArtists()
        }
    }

}