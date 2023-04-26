package com.example.cinemaapp.domain.repositories.tvshows.datasourceimpl

import android.util.Log
import com.example.cinemaapp.data.model.tvshow.TvShow
import com.example.cinemaapp.data.model.tvshow.TvShowList
import com.example.cinemaapp.domain.repositories.tvshows.TvShowRepository
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvCacheDataSource
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvLocaleDataSource
import com.example.cinemaapp.domain.repositories.tvshows.datasource.TvRemoteDataSource
import retrofit2.Response

class TvShowRepositoryImpl(
    private val tvShowRemoteDataSource: TvRemoteDataSource,
    private val tvShowLocaleDataSource: TvLocaleDataSource,
    private val tvShowCacheDataSource: TvCacheDataSource
): TvShowRepository{
    override suspend fun getTvShow(): List<TvShow>? {
        return getTvShowsFromCache()
    }

    override suspend fun updateTvShow(): List<TvShow>? {
        val newListOfTvShows = getTvShowFromAPI()
        tvShowLocaleDataSource.clearAll()
        tvShowLocaleDataSource.saveTvShowsToDB(newListOfTvShows)
        tvShowCacheDataSource.saveTvShowToCache(newListOfTvShows)
        return newListOfTvShows
    }

    suspend fun getTvShowFromAPI(): List<TvShow>{
        lateinit var tvShowsList : List<TvShow>
        try {
            val response : Response<TvShowList> = tvShowRemoteDataSource.getTvShow()
            val body = response.body()
            if(body != null){
                tvShowsList = body.tvShows
            }
        }catch(exception: Exception) {
            Log.i("My Tag", exception.message.toString())
        }
        return tvShowsList
    }

    suspend fun getTvShowFromDB(): List<TvShow>{
        lateinit var tvShowsList : List<TvShow>
        try {
            tvShowsList = tvShowLocaleDataSource.getTvShowsFromDB()
        }catch(exception: Exception) {
            Log.i("My Tag", exception.message.toString())
        }
        if(tvShowsList.size > 0){
            return tvShowsList
        }else{
            tvShowsList = getTvShowFromAPI()
            tvShowLocaleDataSource.saveTvShowsToDB(tvShowsList)
        }
        return tvShowsList
    }

    suspend fun getTvShowsFromCache() : List<TvShow>{
        lateinit var tvShowsList : List<TvShow>
        try{
            tvShowsList = tvShowCacheDataSource.getTvShowFromCache()
        }catch(exception: Exception) {
            Log.i("My Tag", exception.message.toString())
        }
        if (tvShowsList.size > 0){
            return tvShowsList
        }else{
            tvShowsList = getTvShowFromDB()
            tvShowCacheDataSource.saveTvShowToCache(tvShowsList)
        }
        return tvShowsList
    }
}