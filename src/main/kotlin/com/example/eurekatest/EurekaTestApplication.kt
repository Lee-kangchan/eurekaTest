package com.example.eurekatest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaTestApplication

fun main(args: Array<String>) {
    runApplication<EurekaTestApplication>(*args)
}
