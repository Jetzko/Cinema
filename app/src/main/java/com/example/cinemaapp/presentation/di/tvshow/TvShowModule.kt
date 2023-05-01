package com.example.cinemaapp.presentation.di.tvshow



import com.example.cinemaapp.domain.usecase.GetTvShowsUseCase
import com.example.cinemaapp.domain.usecase.UpdateTvShowsUseCase
import com.example.cinemaapp.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}