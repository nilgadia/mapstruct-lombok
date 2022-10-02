package org.shahid.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class Employee {
    private String name;
    private String uid;
    private Date dateOfBirth;
    private double salary;
    private String prefixNumber;
    private String dutyHours;
}
