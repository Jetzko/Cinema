package com.example.cinemaapp.presentation.di.movie

import com.example.cinemaapp.domain.usecases.GetArtistsUseCase
import com.example.cinemaapp.domain.usecases.GetMoviesUseCase
import com.example.cinemaapp.domain.usecases.UpdateArtistsUseCase
import com.example.cinemaapp.domain.usecases.UpdateMoviesUseCase
import com.example.cinemaapp.presentation.artist.ArtistViewModelFactory
import com.example.cinemaapp.presentation.di.artist.ArtistScope
import com.example.cinemaapp.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase, updateMoviesUseCase
        )
    }
}