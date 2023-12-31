package com.employee.resttemplate.controller;

import com.employee.resttemplate.model.EmployeeRequest;
import com.employee.resttemplate.model.EmployeeResponse;
import com.employee.resttemplate.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest-template")
@Slf4j
public class EmployeeRestTemplateController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<EmployeeResponse> saveEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.saveEmployee(employeeRequest));
    }


    @PostMapping("/saveEmployeeExchange")
    public ResponseEntity<EmployeeResponse> saveEmployeeExchange(@RequestBody EmployeeRequest employeeRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.saveEmployeeExchange(employeeRequest));
    }

    @GetMapping(value = "/getEmployees")
    public ResponseEntity<List<EmployeeResponse>> getEmployee() {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployees());
    }

    @GetMapping("/getEmployeeById")
    public ResponseEntity<EmployeeResponse> getEmployeeById(@RequestParam("employeeId") Long employeeId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(employeeService.getEmployeeById(employeeId));
    }




}
