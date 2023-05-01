package com.example.cinemaapp.domain.usecase


import com.example.cinemaapp.data.model.tvshow.TvShow
import com.example.cinemaapp.domain.repository.TvShowRepository


class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()
}