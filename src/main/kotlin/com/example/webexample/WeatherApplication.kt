package com.example.webexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.webexample"])
class WeatherApplication

fun main(args: Array<String>) {
    runApplication<WeatherApplication>(*args)
}