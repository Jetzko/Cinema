package com.example.cinemaapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.cinemaapp.R
import com.example.cinemaapp.databinding.HomeActivityBinding
import com.example.cinemaapp.presentation.artist.ArtistActivity
import com.example.cinemaapp.presentation.movie.MovieActivity
import com.example.cinemaapp.presentation.tv.TvShowActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: HomeActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.home_activity )
        binding.movieButton.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }

        binding.tvButton.setOnClickListener {
            val intent = Intent(this, TvShowActivity::class.java)
            startActivity(intent)
        }

        binding.artistsButton.setOnClickListener {
            val intent = Intent(this, ArtistActivity::class.java)
            startActivity(intent)
        }
    }
}