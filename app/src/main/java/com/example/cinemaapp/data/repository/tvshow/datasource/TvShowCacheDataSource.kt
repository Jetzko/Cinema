package com.example.cinemaapp.data.repository.tvshow.datasource


import com.example.cinemaapp.data.model.tvshow.TvShow


interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)

}