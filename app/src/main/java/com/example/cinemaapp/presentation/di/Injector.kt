package com.example.cinemaapp.presentation.di


import com.example.cinemaapp.presentation.di.artist.ArtistSubComponent
import com.example.cinemaapp.presentation.di.movie.MovieSubComponent
import com.example.cinemaapp.presentation.di.tvshow.TvShowSubComponent

interface Injector {
   fun createMovieSubComponent(): MovieSubComponent
   fun createTvShowSubComponent(): TvShowSubComponent
   fun createArtistSubComponent(): ArtistSubComponent
}