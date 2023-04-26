package com.example.cinemaapp.domain.repositories.movies.datasource

import com.example.cinemaapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}