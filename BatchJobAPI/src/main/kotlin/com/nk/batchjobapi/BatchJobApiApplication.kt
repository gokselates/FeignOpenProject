package com.nk.batchjobapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@Configuration
@EnableScheduling
@EnableFeignClients
class BatchJobApiApplication

fun main(args: Array<String>) {
    runApplication<BatchJobApiApplication>(*args)
}
