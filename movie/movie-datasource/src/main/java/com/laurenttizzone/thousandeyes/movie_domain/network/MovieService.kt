package com.laurenttizzone.thousandeyes.movie_domain.network

import com.laurenttizzone.thousandeyes.movie_domain.Movie
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*

interface MovieService {
    suspend fun getTrendingMovies():List<Movie>

    companion object Factory {
        fun build():MovieService{
            return MovieServiceImpl(
                httpClient = HttpClient(Android){
                    install(JsonFeature){
                        serializer = KotlinxSerializer(
                            kotlinx.serialization.json.Json {
                                ignoreUnknownKeys = true
                            }
                        )
                    }
                }
            )
        }
    }
}