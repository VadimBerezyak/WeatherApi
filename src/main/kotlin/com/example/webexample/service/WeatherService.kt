package com.example.webexample.service

import com.example.webexample.dao.Weather
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service
import java.net.URI
import java.net.http.HttpClient

@Service
class WeatherService (private val weatherHttpClient: HttpClient,
                      private val apiKey: String,
                      private val cityName: String) {

//    @Value("api-key") lateinit var apiKey: String
//    @Value("weatherUrl") lateinit var weatherUrl: String
//    @Value("cityName") lateinit var cityName: String

    @Bean
    fun getWeatherByCity(cityName: String): String {
        val url = "https://api.openweathermap.org/data/2.5/weather?q=$cityName&appid=$apiKey"
        val response = URI.create(url).toURL().readText()
        return response
    }
    @Bean
    fun getWeather() : Weather{
        return Weather(coord = "", weather = "",base = "")
    // реализовать вызов этого метода в контроллере в качестве дебага
    }
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