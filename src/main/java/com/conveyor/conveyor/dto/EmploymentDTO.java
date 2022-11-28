package com.conveyor.conveyor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmploymentDTO {
    private Enum employmentStatus;
    private String employerINN;
    private BigDecimal salary;
    private Enum position;
    private Integer workExperienceTotal;
    private Integer getWorkExperienceCurrent;
}
