package com.employee.resttemplate.service;

import com.employee.resttemplate.model.EmployeeRequest;
import com.employee.resttemplate.model.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeService {



    @Autowired
    private RestTemplate restTemplate;

    public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
      return restTemplate.postForEntity("/saveEmployee",employeeRequest, EmployeeResponse.class).getBody();
    }
        public List<EmployeeResponse> getAllEmployees() {
           return  restTemplate.getForObject("/getEmployees",List.class,"");
        }

       public EmployeeResponse getEmployeeById(Long employeeId) {
            //return restTemplate.getForObject(employeeUrl+"/getEmployeeById?employeeId={employeeId}",EmployeeResponse.class,employeeId);
           return restTemplate.getForEntity("/getEmployeeById?employeeId={employeeId}",EmployeeResponse.class,employeeId).getBody();
        }




}
