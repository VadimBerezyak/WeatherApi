package com.example.webexample.service

import org.springframework.stereotype.Service
import java.net.URI

@Service
class PublicApiService {

    fun getWeatherByCity(cityName: String): String {
        val url = "https://api.openweathermap.org/data/2.5/weather?q=$cityName&appid=$apiKey"
        val response = URI.create(url).toURL().readText()
        return response
    }
        //выводить в консоль данные по погоде +++
        //спринг - in progress...
        //выбрать паблик апишку +++

}