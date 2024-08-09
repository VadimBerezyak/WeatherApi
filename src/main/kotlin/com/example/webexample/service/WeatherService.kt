package com.example.webexample.service

import com.example.webexample.dao.Weather
import com.example.webexample.mapper.Mapper
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class WeatherService(private val ktorHttpClient: HttpClient) {

    @Value("\${weather-url}")
    lateinit var weatherUrl: String

    @Value("\${api-key}")
    lateinit var apiKey: String
    lateinit var weather: Weather
    var objectMapper = ObjectMapper()


    fun getWeatherByCity(cityName: String): Weather {
        val url = "$weatherUrl/data/2.5/weather?q=$cityName&appid=$apiKey"
        var response: String
        runBlocking {
            response = ktorHttpClient.get(url).bodyAsText()
        }
        weather = objectMapper.readValue(response)
        return weather

    }
}
