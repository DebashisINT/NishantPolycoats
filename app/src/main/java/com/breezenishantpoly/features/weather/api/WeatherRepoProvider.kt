package com.breezenishantpoly.features.weather.api

import com.breezenishantpoly.features.task.api.TaskApi
import com.breezenishantpoly.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}