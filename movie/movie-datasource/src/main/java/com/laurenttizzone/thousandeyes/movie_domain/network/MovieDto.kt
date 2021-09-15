package com.laurenttizzone.thousandeyes.movie_domain.network

import com.laurenttizzone.thousandeyes.movie_domain.Movie
import com.laurenttizzone.thousandeyes.movie_domain.network.Endpoints.IMAGE_BASE_URL
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MovieDto(
    @SerialName("first_air_date")
    val firstAirDate: String? = null,

    @SerialName("overview")
    val overview: String? = null,

    @SerialName("original_language")
    val originalLanguage: String? = null,

    @SerialName("genre_ids")
    val genreIds: List<Int?>? = null,

    @SerialName("poster_path")
    val posterPath: String? = null,

    @SerialName("origin_country")
    val originCountry: List<String?>? = null,

    @SerialName("backdrop_path")
    val backdropPath: String? = null,

    @SerialName("media_type")
    val mediaType: String? = null,

    @SerialName("vote_average")
    val voteAverage: Double? = null,

    @SerialName("original_name")
    val originalName: String? = null,

    @SerialName("popularity")
    val popularity: Double? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("id")
    val id: Int? = null,

    @SerialName("vote_count")
    val voteCount: Int? = null,

    @SerialName("original_title")
    val originalTitle: String? = null,

    @SerialName("video")
    val video: Boolean? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("release_date")
    val releaseDate: String? = null,

    @SerialName("adult")
    val adult: Boolean? = null
)
    fun MovieDto.toMovie(): Movie {
        return Movie(
            firstAirDate,
            overview,
            originalLanguage,
            genreIds,
            posterPath="$IMAGE_BASE_URL$posterPath",
            originCountry,
            backdropPath="$IMAGE_BASE_URL$backdropPath",
            mediaType,
            voteAverage,
            originalName,
            popularity,
            name,
            id,
            voteCount,
            originalTitle,
            video,
            title,
            releaseDate,
            adult,
        )
}
