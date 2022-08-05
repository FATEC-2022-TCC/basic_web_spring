package com.web.basic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class BasicApplication

fun main(args: Array<String>) {
    runApplication<BasicApplication>(*args)
}
