package com.laurenttizzone.thousandeyes.movie_domain

data class Movie(
    val firstAirDate: String? = null,
    val overview: String? = null,
    val originalLanguage: String? = null,
    val genreIds: List<Int?>? = null,
    val posterPath: String? = null,
    val originCountry: List<String?>? = null,
    val backdropPath: String? = null,
    val mediaType: String? = null,
    val voteAverage: Double? = null,
    val originalName: String? = null,
    val popularity: Double? = null,
    val name: String = "",
    val id: Int? = null,
    val voteCount: Int? = null,
    val originalTitle: String? = null,
    val video: Boolean? = null,
    val title: String? = null,
    val releaseDate: String? = null,
    val adult: Boolean? = null,
) {

}
