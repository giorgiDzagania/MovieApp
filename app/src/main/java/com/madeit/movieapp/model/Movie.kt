package com.madeit.movieapp.model

import com.madeit.movieapp.R

data class Movie(
    val movieId: Int,
    val movieTitle: String,
    val movieScore: Double,
    val movieImage: Int,
    val movieInfo: Int = R.drawable.ic_info
)

class MovieData {

    val movies = listOf<Movie>(
        Movie(
            movieId = 1,
            movieImage = R.drawable.iv_breaking_bad,
            movieTitle = "Breaking Bad",
            movieScore = 9.5,
        ),
        Movie(
            movieId = 2,
            movieImage = R.drawable.ic_requem_for_a_dream,
            movieTitle = "Requiem For a Dream",
            movieScore = 8.3,
        ),
        Movie(
            movieId = 3,
            movieImage = R.drawable.ic_interstellar,
            movieTitle = "Interstellar",
            movieScore = 8.7,
        ),
        Movie(
            movieId = 4,
            movieImage = R.drawable.ic_ricky_and_morty,
            movieTitle = "Ricky and Morty",
            movieScore = 9.1,
        ),
        Movie(
            movieId = 5,
            movieImage = R.drawable.iv_fight_club,
            movieTitle = "Fight Club",
            movieScore = 8.8,
        )
    )

}