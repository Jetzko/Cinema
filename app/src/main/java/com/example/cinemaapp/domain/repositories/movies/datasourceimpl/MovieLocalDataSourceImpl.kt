package com.example.cinemaapp.domain.repositories.movies.datasourceimpl

import com.example.cinemaapp.data.db.MovieDao
import com.example.cinemaapp.data.model.movie.Movie
import com.example.cinemaapp.domain.repositories.movies.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
//Fetch data from DB
class MovieLocalDataSourceImpl(private val movieDao: MovieDao) : MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
        return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
CoroutineScope(Dispatchers.IO).launch {
    movieDao.saveMovies(movies)
}   }

    override suspend fun clearAll() {
CoroutineScope(Dispatchers.IO).launch {
    movieDao.deleteAllMovies()
}    }
}