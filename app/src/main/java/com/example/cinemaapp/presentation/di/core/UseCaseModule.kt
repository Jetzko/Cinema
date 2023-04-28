package com.example.cinemaapp.presentation.di.core

import com.example.cinemaapp.domain.repositories.artists.ArtistsRepository
import com.example.cinemaapp.domain.repositories.movies.MovieRepository
import com.example.cinemaapp.domain.repositories.tvshows.TvShowRepository
import com.example.cinemaapp.domain.usecases.*
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMoviesUseCase(movieRepository: MovieRepository):GetMoviesUseCase{
        return GetMoviesUseCase(movieRepository)
    }
    @Provides
    fun provideUpdateMoviesUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase{
        return UpdateMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideGetTvShowsUseCase(tvShowRepository: TvShowRepository):GetTvShowsUseCase{
        return GetTvShowsUseCase(tvShowRepository)
    }
    @Provides
    fun provideUpdateTvShowsUseCase(tvShowRepository: TvShowRepository): UpdateTvShowUseCase{
        return UpdateTvShowUseCase(tvShowRepository)
    }

    @Provides
    fun provideGetArtistsUseCase(artistsRepository: ArtistsRepository):GetArtistsUseCase{
        return GetArtistsUseCase(artistsRepository)
    }
    @Provides
    fun provideUpdateArtistsUseCase(artistsRepository: ArtistsRepository): UpdateArtistsUseCase{
        return UpdateArtistsUseCase(artistsRepository)
    }
}