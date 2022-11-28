package com.conveyor.conveyor.dto;

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
    private Enum theme;
    private Long applicationId;
}
