package com.conveyor.conveyor.dto;

import com.conveyor.conveyor.dto.enums.Theme;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailMessage {

    private String address;
    private Theme theme;
    private Long applicationId;
}
