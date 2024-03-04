package com.misiegn.weatherapp.domain.repository

import com.misiegn.weatherapp.data.local.WeatherEntity
import com.misiegn.weatherapp.domain.util.Resource
import com.misiegn.weatherapp.domain.weather.WeatherData
import com.misiegn.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun gerWeatherData(
        lat: Double,
        long: Double
    ): Resource<WeatherInfo>

    suspend fun getWeatherDataFromDataBase() : List<WeatherEntity>

    suspend fun insertWeatherData(data: WeatherData)

}