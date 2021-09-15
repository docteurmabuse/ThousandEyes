package com.laurenttizzone.thousandeyes.movie_domain.network

import com.laurenttizzone.thousandeyes.movie_domain.Movie
import io.ktor.client.*
import io.ktor.client.request.*


class MovieServiceImpl(
    private val httpClient: HttpClient
) : MovieService {
    override suspend fun getTrendingMovies():List<Movie> {
        return httpClient.get<List<MovieDto>> {
        url(Endpoints.BASE_URL)
        }.map { it.toMovie() }
    }
}