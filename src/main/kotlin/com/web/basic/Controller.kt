package com.web.basic

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
object Controller {
    @GetMapping
    fun helloWorld() = "Hello World"
}