package com.example.cinemaapp.data.repository.movie.datasource


import com.example.cinemaapp.data.model.movie.MovieList

import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}