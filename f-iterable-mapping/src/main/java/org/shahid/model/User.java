package org.shahid.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    private String fullName;
    private Address address;
    private List<Authority> authorities;
}