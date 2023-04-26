package com.example.cinemaapp.domain.repositories.movies.datasource

import com.example.cinemaapp.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies : List<Movie>)
}