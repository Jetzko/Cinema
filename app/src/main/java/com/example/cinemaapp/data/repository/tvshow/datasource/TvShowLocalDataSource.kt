package com.example.cinemaapp.data.repository.tvshow.datasource


import com.example.cinemaapp.data.model.tvshow.TvShow


interface TvShowLocalDataSource {
  suspend fun getTvShowsFromDB():List<TvShow>
  suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
  suspend fun clearAll()
}