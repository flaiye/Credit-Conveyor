package com.conveyor.conveyor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanApplicationRequestDTO {
    @Min(10000)
    private BigDecimal amount;
    private Integer term;
    @Min(2)
    @Max(30)
    @NotBlank
    private String firstName;
    @Min(2)
    @Max(30)
    @NotBlank
    private String lastName;
    @Min(2)
    @Max(30)
    private String middleName;
    private String email;
    private LocalDate birthdate; // or birthDate ?
    private String passportSeries;
    private String passportNumber;

}
