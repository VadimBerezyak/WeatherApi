package com.example.webexample.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking

@Service
class WeatherService(private val ktorHttpClient: HttpClient) {

    @Value("\${weather-url}")
    lateinit var weatherUrl: String

    @Value("\${api-key}")
    lateinit var apiKey: String

    fun getWeatherByCity(cityName: String): String {
        val url = "$weatherUrl/data/2.5/weather?q=$cityName&appid=$apiKey"
        var response: String
        runBlocking {
            response = ktorHttpClient.get(url).bodyAsText()
        }
        return response
    }

//    fun getWeather(): Weather {
//        return Weather(cord = "", weather = "", base = "")
//    // реализовать вызов этого метода в контроллере в качестве дебага
//    }
    //выводить в консоль данные по погоде +++
    //спринг - in progress...
    //выбрать паблик апишку +++
}

//fun main(args: Array<String>) {
//    val apiKey = "98f4fee2bf790b8dfcd0108ebf273125"
//    val weatherApiClient = MentoringApplication (apiKey)
//    val cityName = "London"
//    val weatherData = weatherApiClient.getWeatherByCity(cityName)
//
//    println("Weather in $cityName:")
//    println(weatherData)
//}
//
//class MentoringApplication (private val apiKey: String) {
//
//    fun getWeatherByCity(cityName: String): String {
//        val url = "https://api.openweathermap.org/data/2.5/weather?q=$cityName&appid=$apiKey"
//        val response = URI.create(url).toURL().readText()
//        return response
//    }
//}