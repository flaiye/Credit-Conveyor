package com.conveyor.conveyor.dto;

import lombok.Data;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String patronymic;
    private byte age;
}
