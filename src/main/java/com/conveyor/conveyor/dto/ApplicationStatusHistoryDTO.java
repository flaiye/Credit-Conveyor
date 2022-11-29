package com.conveyor.conveyor.dto;

import com.conveyor.conveyor.dto.enums.ChangeType;
import com.conveyor.conveyor.dto.enums.Status;
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

    private Status status;
    private LocalDateTime time;
    private ChangeType changeType;
}
