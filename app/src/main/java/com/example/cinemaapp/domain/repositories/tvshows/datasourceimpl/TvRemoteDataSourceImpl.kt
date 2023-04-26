package com.example.cinemaapp.domain.repositories.tvshows.datasourceimpl

import com.example.cinemaapp.data.api.TMDBService
import com.example.cinemaapp.data.model.tvshow.TvShowList
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvRemoteDataSource
import retrofit2.Response

class TvRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): TvRemoteDataSource {
    override suspend fun getTvShow(): Response<TvShowList> {
        return tmdbService.getPopularTvShows(apiKey)
    }

}