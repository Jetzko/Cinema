package com.example.cinemaapp.data.repository.movie.datasourceImpl


import com.example.cinemaapp.data.api.TMDBService
import com.example.cinemaapp.data.model.movie.MovieList
import com.example.cinemaapp.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

