package com.example.cinemaapp.presentation.di.artist


import com.example.cinemaapp.domain.usecase.GetArtistsUseCase
import com.example.cinemaapp.domain.usecase.UpdateArtistsUseCase
import com.example.cinemaapp.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}