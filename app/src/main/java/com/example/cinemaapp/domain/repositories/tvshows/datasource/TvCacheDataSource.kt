package com.example.cinemaapp.domain.repositories.tvshows.datasource

import com.example.cinemaapp.data.model.tvshow.TvShow

interface TvCacheDataSource {
    suspend fun getTvShowFromCache(): List<TvShow>
    suspend fun saveTvShowToCache(tvShow : List<TvShow>)
}