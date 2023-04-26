package com.example.cinemaapp.domain.repositories.movies

import com.example.cinemaapp.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}