package com.example.cinemaapp.domain.repositories.movies.datasourceimpl

import com.example.cinemaapp.data.model.movie.Movie
import com.example.cinemaapp.domain.repositories.movies.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl : MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}