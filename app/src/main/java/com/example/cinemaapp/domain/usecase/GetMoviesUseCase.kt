package com.example.cinemaapp.domain.usecase


import com.example.cinemaapp.data.model.movie.Movie
import com.example.cinemaapp.domain.repository.MovieRepository


class GetMoviesUseCase(private val movieRepository: MovieRepository) {
  suspend fun execute():List<Movie>? = movieRepository.getMovies()
}