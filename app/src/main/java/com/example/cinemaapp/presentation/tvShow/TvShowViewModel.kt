package com.example.cinemaapp.presentation.tvShow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cinemaapp.domain.usecases.GetTvShowsUseCase
import com.example.cinemaapp.domain.usecases.UpdateTvShowUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowUseCase: UpdateTvShowUseCase
): ViewModel() {
    fun getTvShows()= liveData {
        val tvShowsList = getTvShowsUseCase.execute()
        emit(tvShowsList)
    }
    fun updateTvShows()= liveData {
        val tvShowsList = updateTvShowUseCase.execute()
        emit(tvShowsList)
    }
}