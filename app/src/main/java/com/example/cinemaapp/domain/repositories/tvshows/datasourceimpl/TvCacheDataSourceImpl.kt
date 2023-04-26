package com.example.cinemaapp.domain.repositories.tvshows.datasourceimpl

import com.example.cinemaapp.data.model.tvshow.TvShow
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvCacheDataSource

class TvCacheDataSourceImpl : TvCacheDataSource {
    private var tvShowsList = ArrayList<TvShow>()
    override suspend fun getTvShowFromCache(): List<TvShow> {
        return tvShowsList
    }

    override suspend fun saveTvShowToCache(tvShow: List<TvShow>) {
        tvShowsList.clear()
        tvShowsList = ArrayList(tvShow)
    }
}