package com.example.cinemaapp.data.repository.movie.datasource

import com.example.cinemaapp.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}