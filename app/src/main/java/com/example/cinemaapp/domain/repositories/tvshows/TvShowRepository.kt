package com.example.cinemaapp.domain.repositories.tvshows

import com.example.cinemaapp.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShow(): List<TvShow>?
    suspend fun updateTvShow(): List<TvShow>?
}