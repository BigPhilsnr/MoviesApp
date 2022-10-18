package com.philipademba.takehome.data.models.database.entities

import androidx.compose.runtime.Immutable
import androidx.room.Entity


@Immutable
@Entity(primaryKeys = [("id")])
data class Movie(
    val id: Int,
    val firstAirDate: String? = "",
    val name: String,
    val originalTitle: String,
    val originalLanguage: String,
    val overview: String,
    val posterPath: String?,
    val voteAverage: Double,
    val voteCount: Int,
    val page: Int
)