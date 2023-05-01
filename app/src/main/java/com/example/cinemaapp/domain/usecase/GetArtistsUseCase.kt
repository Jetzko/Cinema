package com.example.cinemaapp.domain.usecase


import com.example.cinemaapp.data.model.artist.Artist
import com.example.cinemaapp.domain.repository.ArtistRepository


class GetArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtists()

}