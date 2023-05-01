package com.example.cinemaapp.presentation.di.movie




import com.example.cinemaapp.domain.usecase.GetMoviesUseCase
import com.example.cinemaapp.domain.usecase.UpdateMoviesUsecase
import com.example.cinemaapp.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}