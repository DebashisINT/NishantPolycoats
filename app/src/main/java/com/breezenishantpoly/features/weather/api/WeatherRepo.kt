package com.breezenishantpoly.features.weather.api

import com.breezenishantpoly.base.BaseResponse
import com.breezenishantpoly.features.task.api.TaskApi
import com.breezenishantpoly.features.task.model.AddTaskInputModel
import com.breezenishantpoly.features.weather.model.ForeCastAPIResponse
import com.breezenishantpoly.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}