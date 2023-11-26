package com.employee.resttemplate.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Value(value = "${spring.employee.url}")
    private String employeeUrl;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        return restTemplateBuilder.rootUri(employeeUrl).build();

    }

}
