package com.example.cinemaapp.presentation.di.tvshow

import com.example.cinemaapp.presentation.tv.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():TvShowSubComponent
    }

}

