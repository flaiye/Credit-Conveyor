package com.conveyor.conveyor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicationStatusHistoryDTO {

    private Enum status;
    private LocalDateTime time;
    private Enum changeType;
}
