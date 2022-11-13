package com.conveyor.conveyor.model;

import lombok.Data;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String patronymic;
    private byte age;
}
