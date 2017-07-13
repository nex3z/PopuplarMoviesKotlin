package com.nex3z.popularmovieskotlin.data.repository.movie

import com.nex3z.popularmovieskotlin.data.entity.movie.DiscoverMovieResponse
import com.nex3z.popularmovieskotlin.data.entity.movie.MovieEntity
import io.reactivex.Single

interface MovieRepository {

    fun discoverMovies(page: Int, sortBy: String): Single<DiscoverMovieResponse>

    fun getFavourites(): Single<List<MovieEntity>>

    fun addFavourite(movie: MovieEntity): Single<Unit>

    fun removeFavourite(movieId: Long): Single<MovieEntity>

    fun isFavourite(movieId: Long): Single<Boolean>

}