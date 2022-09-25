package org.shahid.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
}
 