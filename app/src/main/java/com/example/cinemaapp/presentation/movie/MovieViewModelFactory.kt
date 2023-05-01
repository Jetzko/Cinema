package com.example.cinemaapp.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cinemaapp.domain.usecase.GetMoviesUseCase
import com.example.cinemaapp.domain.usecase.UpdateMoviesUsecase


class MovieViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase,updateMoviesUsecase) as T
    }
}

