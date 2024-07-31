package com.example.webexample.controller

import com.example.webexample.service.WeatherService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class WeatherController(private val weatherService: WeatherService) {
    /* прравильный нейминг + аннотация контроллера
    заинжектить бин сервиса weatherService
    создать один метод
     */
  @GetMapping("/weather")
    fun getWeather() {
        weatherService.getWeather()
}


}