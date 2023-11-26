package com.employee.resttemplate.service;

import com.employee.resttemplate.model.EmployeeRequest;
import com.employee.resttemplate.model.EmployeeResponse;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {


    @Autowired
    private RestTemplate restTemplate;

    public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
        return restTemplate.postForEntity("/saveEmployee", employeeRequest, EmployeeResponse.class).getBody();
    }

    public EmployeeResponse saveEmployeeExchange(EmployeeRequest employeeRequest) {
        return restTemplate.exchange("/saveEmployee", HttpMethod.POST, new HttpEntity<>(employeeRequest), EmployeeResponse.class).getBody();
    }

    @HystrixCommand(
            fallbackMethod = "handleEmployeeServiceGetAllEmployeesDownTime")
    public List<EmployeeResponse> getAllEmployees() {
        return restTemplate.getForObject("/getEmployees", List.class, "");
    }

    public List<EmployeeResponse> handleEmployeeServiceGetAllEmployeesDownTime(Throwable throwable) {
     log.info("fallback started here..");
        //return restTemplate.getForObject("/getEmployees", List.class, "");
        return null;
    }

    public EmployeeResponse getEmployeeById(Long employeeId) {
        //return restTemplate.getForObject(employeeUrl+"/getEmployeeById?employeeId={employeeId}",EmployeeResponse.class,employeeId);
        return restTemplate.getForEntity("/getEmployeeById?employeeId={employeeId}", EmployeeResponse.class, employeeId).getBody();
    }


}
