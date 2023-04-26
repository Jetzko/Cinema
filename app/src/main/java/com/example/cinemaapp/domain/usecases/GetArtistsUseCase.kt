package com.example.cinemaapp.domain.usecases

import com.example.cinemaapp.data.model.artist.Artist
import com.example.cinemaapp.domain.repositories.artists.ArtistsRepository

class GetArtistsUseCase(private val artistsRepository: ArtistsRepository) {
    suspend fun execute(): List<Artist>? = artistsRepository.getArtists()
}