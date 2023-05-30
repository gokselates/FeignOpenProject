package com.nk.customerapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {

    @GetMapping("/customer-status")
    fun getCustomerStatus(): String {
        println("Status OK!")
        return "Status OK!"
    }
}