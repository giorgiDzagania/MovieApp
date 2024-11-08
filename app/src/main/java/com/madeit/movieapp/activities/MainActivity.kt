package com.madeit.movieapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.madeit.movieapp.adapter.OnInfoClickListener
import com.madeit.movieapp.adapter.PopularMovieAdapter
import com.madeit.movieapp.databinding.ActivityMainBinding
import com.madeit.movieapp.model.Movie

class MainActivity : AppCompatActivity(), OnInfoClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var popularMovieAdapter: PopularMovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        popularMovieAdapter = PopularMovieAdapter(this)
        prepareRecyclerView()
    }

    private fun prepareRecyclerView() {
        binding.popularMovieRecyclerView.apply {
            adapter = popularMovieAdapter
            layoutManager = LinearLayoutManager(
                this@MainActivity, LinearLayoutManager.VERTICAL, false
            )
        }
    }

    override fun onInfoClick(movie: Movie) {
        val message = "${movie.movieTitle} - ${movie.movieScore}"
        Snackbar.make(binding.root, message, Snackbar.LENGTH_SHORT).show()
    }


}