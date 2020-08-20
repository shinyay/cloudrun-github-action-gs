package com.google.shinyay.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@RestController
class HelloController {

    @GetMapping("/")
    fun hello(): String {
        val jstDateTime = ZonedDateTime.now(ZoneId.of("Japan"))
        val format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        return jstDateTime.format(format).toString()
    }
}