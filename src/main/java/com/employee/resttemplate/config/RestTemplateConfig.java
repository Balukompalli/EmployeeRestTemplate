package com.employee.resttemplate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate =  new RestTemplate();
//        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
//        restTemplate.getMessageConverters().add(new MappingJackson2CborHttpMessageConverter());

        return restTemplate;
    }

}
