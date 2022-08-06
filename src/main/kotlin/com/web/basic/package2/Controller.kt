package com.web.basic.package2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger

@RestController
object Controller {
    private val idGenerator = AtomicInteger(0)

    @GetMapping
    fun helloWorld() = "Hello World"

    @GetMapping("data")
    fun data(
        @RequestParam(defaultValue = "no content") content: String
    ) = Data(
        id = idGenerator.incrementAndGet(),
        content = content
    )
}