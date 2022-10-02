package org.shahid.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Employee {

    private String name;
    private Employee reportsTo;
    private List<Employee> team;
}
