package com.example.cinemaapp.domain.repositories.tvshows.datasource

import com.example.cinemaapp.data.model.tvshow.TvShow

interface TvLocaleDataSource {
    suspend fun getTvShowsFromDB(): List<TvShow>
    suspend fun saveTvShowsToDB(tvShows : List<TvShow>)
    suspend fun clearAll()
}