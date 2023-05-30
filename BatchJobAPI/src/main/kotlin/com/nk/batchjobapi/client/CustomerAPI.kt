package com.nk.batchjobapi.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(value = "customer-status", url = "http://localhost:8081/")
interface CustomerAPI {

    @GetMapping("/customer-status")
    fun getCustomerStatus(): String
}