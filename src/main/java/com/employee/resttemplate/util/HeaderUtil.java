package com.employee.resttemplate.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
public class HeaderUtil {
    @Autowired
    private RestTemplate restTemplate;

    HttpHeaders headers = null;
    ObjectMapper objectMapper = null;

    @PostConstruct
    public void getHttpHeaders() {
       headers = new  HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        objectMapper =  new ObjectMapper();
    }


}
