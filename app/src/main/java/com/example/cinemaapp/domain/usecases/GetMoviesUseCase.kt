package com.example.cinemaapp.domain.usecases

import com.example.cinemaapp.data.model.movie.Movie
import com.example.cinemaapp.domain.repositories.movies.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}