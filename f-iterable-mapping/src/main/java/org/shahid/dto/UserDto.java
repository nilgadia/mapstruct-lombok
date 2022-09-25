package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class UserDto {

    private String name;
    private String address;
    private Set<String> authorities;
}