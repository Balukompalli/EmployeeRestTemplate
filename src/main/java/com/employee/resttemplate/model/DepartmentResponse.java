package com.employee.resttemplate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartmentResponse implements Serializable {

    private Long departmentId;
    private String departmentName;
    private List<EmployeeRequest> employeeList;

}
