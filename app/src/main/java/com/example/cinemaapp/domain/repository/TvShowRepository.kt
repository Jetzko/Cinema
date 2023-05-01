package com.example.cinemaapp.domain.repository

import com.example.cinemaapp.data.model.tvshow.TvShow


interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}