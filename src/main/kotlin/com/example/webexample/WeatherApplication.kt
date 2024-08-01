package com.example.webexample

import com.example.webexample.dao.Weather
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.webexample"])
//@EnableConfigurationProperties(value = [WeatherHttpClientConfiguration::class])
class WeatherApplication

fun main(args: Array<String>) {
    runApplication<WeatherApplication>(*args)
}