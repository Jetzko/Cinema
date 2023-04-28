package com.example.cinemaapp.presentation.di.core

import com.example.cinemaapp.presentation.di.artist.ArtistSubComponent
import com.example.cinemaapp.presentation.di.movie.MovieSubComponent
import com.example.cinemaapp.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DataBaseModule::class,
        RepositoryModule::class,
        UseCaseModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class
    ]
)
interface AppComponent {
    fun movieSubComponent():MovieSubComponent.Factory
    fun tvShowSubComponent():TvShowSubComponent.Factory
    fun artistSubComponent():ArtistSubComponent.Factory
}