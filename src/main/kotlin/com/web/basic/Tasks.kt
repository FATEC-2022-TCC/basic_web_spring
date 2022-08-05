package com.web.basic

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.text.SimpleDateFormat
import java.util.*

@Component
object Tasks {
    private val logger = getLogger<Tasks>()
    private val sdf = SimpleDateFormat("HH:mm:ss")

    @Scheduled(fixedRate = 5000)
    fun reportCurrentTime() {
        logger.info("Current time: {}", sdf.format(Date()))
    }
}