package com.nk.batchjobapi.task

import com.nk.batchjobapi.client.CustomerAPI
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class CustomerTask(private val customerAPI: CustomerAPI) {

    @Scheduled(cron="0 * * * * *")
    fun getCustomerStatus(): String{
        return customerAPI.getCustomerStatus()
    }
}