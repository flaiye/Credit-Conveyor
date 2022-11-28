package com.conveyor.conveyor.controller;

import com.conveyor.conveyor.dto.CreditDTO;
import com.conveyor.conveyor.dto.ScoringDataDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    @PostMapping("conveyor/calculation")
    public CreditDTO calculate(ScoringDataDTO scoringData) {
        return null;
    }
}
