package com.laurenttizzone.thousandeyes.movie_interactors

import com.laurenttizzone.thousandeyes.movie_domain.network.MovieService

data class MovieInteractors(
    val getMovies: GetMovies,
    //TODO(Add other movie interactors
) {
    companion object Factory {
        fun build(): MovieInteractors {
            val service = MovieService.build()
            return MovieInteractors(
                getMovies = GetMovies(
                    service = service
                ),
            )
        }

    }
}