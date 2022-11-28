package com.conveyor.conveyor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FinishRegistrationRequestDTO {

    private Enum gender;
    private Enum maritalStatus;
    private Integer dependentAmount;
    private LocalDate passportIssueDate;
    private LocalDate passportIssueBranch;
    private EmploymentDTO employment;
    private String account;
}
