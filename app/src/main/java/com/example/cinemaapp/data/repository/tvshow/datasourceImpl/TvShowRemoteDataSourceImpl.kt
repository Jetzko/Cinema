package com.example.cinemaapp.data.repository.tvshow.datasourceImpl



import com.example.cinemaapp.data.api.TMDBService
import com.example.cinemaapp.data.model.tvshow.TvShowList
import com.example.cinemaapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

