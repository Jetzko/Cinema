package com.example.cinemaapp.presentation.artist


import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cinemaapp.domain.usecase.GetArtistsUseCase
import com.example.cinemaapp.domain.usecase.UpdateArtistsUseCase


class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
): ViewModel() {

    fun getArtists() = liveData {
        Log.i("ARTTAG","artist view model getArtists")
        val artistList = getArtistsUseCase.execute()
        emit(artistList)
    }

    fun updateArtists() = liveData {
        val artistList = updateArtistsUseCase.execute()
        emit(artistList)
    }

}