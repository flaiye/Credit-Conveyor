package com.conveyor.conveyor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
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
    @Size(min = 2, max = 30)
    @NotBlank
    private String firstName;
    @Size(min = 2, max = 30)
    @NotBlank
    private String lastName;
    @Size(min = 2, max = 30)
    private String middleName;
    @Email(message = "Email is not valid", regexp = "^(.+)@(\\\\S+)$") //TODO заменить на [\w\.]{2,50}@[\w\.]{2,20}
    private String email;
    private LocalDate birthdate; // or birthDate ?
    @Range(min = 4, max = 4)
    private String passportSeries;
    @Range(min = 8, max = 8)
    private String passportNumber;

}
