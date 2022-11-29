package com.conveyor.conveyor.dto;

import com.conveyor.conveyor.dto.enums.Gender;
import com.conveyor.conveyor.dto.enums.MaritalStatus;
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

    private Gender gender;
    private MaritalStatus maritalStatus;
    private Integer dependentAmount;
    private LocalDate passportIssueDate;
    private LocalDate passportIssueBranch;
    private EmploymentDTO employment;
    //безработный - отказ, самозанятый - ставка увеличивается на 1, владелец бинеса - ставка увеличивается на 3
    private String account;
}
