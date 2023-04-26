package com.example.cinemaapp.domain.usecases

import com.example.cinemaapp.data.model.tvshow.TvShow
import com.example.cinemaapp.domain.repositories.tvshows.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShow()
}