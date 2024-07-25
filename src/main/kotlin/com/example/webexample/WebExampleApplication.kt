package com.example.webexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import java.net.URI

@SpringBootApplication
class WebExampleApplication

fun main(args: Array<String>) {
    val apiKey = "98f4fee2bf790b8dfcd0108ebf273125"
    val weatherApiClient = MentoringApplication (apiKey)
    val cityName = "London"
    val weatherData = weatherApiClient.getWeatherByCity(cityName)

    println("Weather in $cityName:")
    println(weatherData)
}

class MentoringApplication (private val apiKey: String) {

    fun getWeatherByCity(cityName: String): String {
        val url = "https://api.openweathermap.org/data/2.5/weather?q=$cityName&appid=$apiKey"
        val response = URI.create(url).toURL().readText()
        return response
    }
}