package com.example.cinemaapp.domain.repositories.movies.datasourceimpl

import com.example.cinemaapp.data.api.TMDBService
import com.example.cinemaapp.data.model.movie.MovieList
import com.example.cinemaapp.domain.repositories.movies.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}