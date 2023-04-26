package com.example.cinemaapp.domain.repositories.tvshows.datasource

import com.example.cinemaapp.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvRemoteDataSource {
    suspend fun getTvShow() : Response<TvShowList>
}