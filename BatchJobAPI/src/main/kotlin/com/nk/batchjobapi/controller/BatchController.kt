package com.nk.batchjobapi.controller

import com.nk.batchjobapi.client.CustomerAPI
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BatchController(
    private val customerAPI: CustomerAPI
) {

    @GetMapping("/batch-customer-status")
    fun getCustomerStatus(): String{
        return customerAPI.getCustomerStatus()
    }

}