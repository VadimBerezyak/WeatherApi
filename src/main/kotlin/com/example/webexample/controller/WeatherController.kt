package com.example.webexample.controller

import com.example.webexample.dao.Weather
import com.example.webexample.service.WeatherService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WeatherController(
    private val weatherService: WeatherService
) {
    @GetMapping("/weather")
    fun getWeather(@RequestParam city: String): Weather {
        return weatherService.getWeatherByCity(city)
    }
}