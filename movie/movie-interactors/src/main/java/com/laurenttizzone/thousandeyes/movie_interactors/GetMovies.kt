package com.laurenttizzone.thousandeyes.movie_interactors

import com.laurenttizzone.thousandeyes.core.DataState
import com.laurenttizzone.thousandeyes.core.ProgressBarState
import com.laurenttizzone.thousandeyes.core.UIComponent
import com.laurenttizzone.thousandeyes.movie_domain.Movie
import com.laurenttizzone.thousandeyes.movie_domain.network.MovieService
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetMovies(
    private val service: MovieService
    //TODO(Add caching)
) {
    fun execute(): Flow<DataState<List<Movie>>> = flow {
        try {
            emit(DataState.Loading(progressBarState = ProgressBarState.Loading))

            delay(1000)

            val movies: List<Movie> = try {
                service.getTrendingMovies()
            } catch (e: Exception) {
                e.printStackTrace()
                emit(
                    DataState.Response<List<Movie>>(
                        uiComponent = UIComponent.Dialog(
                            title = "Error",
                            description = e.message ?: "Unknown Error"
                        )
                    )
                )
                listOf()
            }
            //TODO(caching)
            emit(DataState.Data(movies))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(
                DataState.Response<List<Movie>>(
                    uiComponent = UIComponent.Dialog(
                        title = "Error",
                        description = e.message ?: "Unknown Error"
                    )
                )
            )
        }
        finally {
            emit(DataState.Loading(progressBarState = ProgressBarState.Idle))
        }
    }
}