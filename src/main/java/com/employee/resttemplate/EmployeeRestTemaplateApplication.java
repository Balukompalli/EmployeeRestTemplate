package com.employee.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//@EnableHystrix
//@EnableDiscoveryClient
public class EmployeeRestTemaplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeRestTemaplateApplication.class, args);
    }

}
