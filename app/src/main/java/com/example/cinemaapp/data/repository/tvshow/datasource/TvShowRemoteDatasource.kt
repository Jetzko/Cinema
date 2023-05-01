package com.example.cinemaapp.data.repository.tvshow.datasource


import com.example.cinemaapp.data.model.tvshow.TvShowList

import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}