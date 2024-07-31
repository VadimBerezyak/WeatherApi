package com.example.webexample.controller

import com.example.webexample.dao.Weather
import com.example.webexample.service.PublicApiService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class WeatherController(private val weatherService: PublicApiService) {
    /* прравильный нейминг + аннотация контроллера
    заинжектить бин сервиса weatherService
    создать один метод
     */
  @GetMapping("/weather")
    fun getWeather() {
        weatherService.getWeather()
}


}