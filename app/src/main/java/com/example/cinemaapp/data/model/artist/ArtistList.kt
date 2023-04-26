package com.example.cinemaapp.data.model.artist
import com.example.cinemaapp.data.model.artist.Artist
import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("artists")
    val artists: List<Artist>
)