package org.shahid.model;

import lombok.Data;

@Data
public class Doctor {
    private int id;
    private String name;
    private String phone;
    private int cityId;
}