package com.conveyor.conveyor.dto;

import com.conveyor.conveyor.dto.enums.EmploymentStatus;
import com.conveyor.conveyor.dto.enums.Position;
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
    private EmploymentStatus employmentStatus;
    private String employerINN;
    private BigDecimal salary;
    private Position position;
    private Integer workExperienceTotal;
    private Integer getWorkExperienceCurrent;
}
