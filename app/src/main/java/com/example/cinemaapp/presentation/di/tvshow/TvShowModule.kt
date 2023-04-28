package com.example.cinemaapp.presentation.di.tvshow

import com.example.cinemaapp.domain.usecases.GetArtistsUseCase
import com.example.cinemaapp.domain.usecases.GetTvShowsUseCase
import com.example.cinemaapp.domain.usecases.UpdateArtistsUseCase
import com.example.cinemaapp.domain.usecases.UpdateTvShowUseCase
import com.example.cinemaapp.presentation.artist.ArtistViewModelFactory
import com.example.cinemaapp.presentation.tvShow.TvShowViewModel
import com.example.cinemaapp.presentation.tvShow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowUseCase: UpdateTvShowUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase, updateTvShowUseCase
        )
    }
}