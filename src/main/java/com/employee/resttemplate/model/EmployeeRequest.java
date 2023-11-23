package com.employee.resttemplate.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class EmployeeRequest {
    private Long employeeId;
    private String employeeName;
    private DepartmentRequest department;
    private Long salary;

}
