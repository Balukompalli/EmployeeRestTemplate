package com.employee.resttemplate.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class EmployeeResponse {
    private Long employeeId;
    private String employeeName;
    private DepartmentResponse department;
    private Long salary;

}
