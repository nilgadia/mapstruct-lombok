package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeDto {

    private String employeeName;
    private EmployeeDto reportsTo;
    private List<EmployeeDto> team;

}
