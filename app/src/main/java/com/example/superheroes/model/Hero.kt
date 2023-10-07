package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val ability: Int,
    @StringRes val vulnerability: Int,
    val vulnerableDetail: Int
)