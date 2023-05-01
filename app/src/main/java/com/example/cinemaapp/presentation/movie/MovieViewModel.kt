package com.example.cinemaapp.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cinemaapp.domain.usecase.GetMoviesUseCase
import com.example.cinemaapp.domain.usecase.UpdateMoviesUsecase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
): ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUsecase.execute()
        emit(movieList)
    }

    }





