package com.madeit.movieapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.madeit.movieapp.databinding.ItemMovieBinding
import com.madeit.movieapp.model.Movie
import com.madeit.movieapp.model.MovieData

class PopularMovieAdapter(private var onInfoClickListener: OnInfoClickListener) :
    RecyclerView.Adapter<PopularMovieAdapter.PopularMovieViewHolder>() {

    private val movies = MovieData().movies

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularMovieViewHolder {
        val view = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PopularMovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopularMovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    inner class PopularMovieViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            with(binding) {
                Glide.with(root.context)
                    .load(movie.movieImage)
                    .into(ivItemImage)

                tvItemTitle.text = movie.movieTitle
                tvItemScore.text = movie.movieScore.toString()

                ivInfo.setOnClickListener {
                    onInfoClickListener.onInfoClick(movie)
                }
            }
        }
    }
}