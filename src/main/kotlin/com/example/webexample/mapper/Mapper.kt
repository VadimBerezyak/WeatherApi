package com.example.webexample.mapper

import com.example.webexample.dao.Weather
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class Mapper {
    val mapper = jacksonObjectMapper()

    fun deserialization(json: String) : Weather {
        return mapper.readValue(json)
    }
}