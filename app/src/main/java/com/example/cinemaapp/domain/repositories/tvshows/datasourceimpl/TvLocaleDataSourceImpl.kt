package com.example.cinemaapp.domain.repositories.tvshows.datasourceimpl

import com.example.cinemaapp.data.db.TvShowsDao
import com.example.cinemaapp.data.model.tvshow.TvShow
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvLocaleDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvLocaleDataSourceImpl(private val tvShowDao: TvShowsDao) : TvLocaleDataSource {
    override suspend fun getTvShowsFromDB(): List<TvShow> {
        return tvShowDao.getTvShows()
    }

    override suspend fun saveTvShowsToDB(tvShows: List<TvShow>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.saveTvShows(tvShows) }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.deleteAllTvShows()
        }
    }
}