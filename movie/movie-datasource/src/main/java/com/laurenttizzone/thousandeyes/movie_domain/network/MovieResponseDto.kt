package com.laurenttizzone.thousandeyes.movie_domain.network

import kotlinx.serialization.SerialName

data class MovieResponseDto(
    @SerialName("page")
    val page: Int? = null,

    @SerialName("total_pages")
    val totalPages: Int? = null,

    @SerialName("results")
    val results: List<MovieDto?>? = null,

    @SerialName("total_results")
    val totalResults: Int? = null
)
