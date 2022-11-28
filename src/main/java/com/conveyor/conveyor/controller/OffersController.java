package com.conveyor.conveyor.controller;

import com.conveyor.conveyor.dto.LoanApplicationRequestDTO;
import com.conveyor.conveyor.dto.LoanOfferDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OffersController {

    @PostMapping("/conveyor/offers")
    public List<LoanOfferDTO> createOffer(LoanApplicationRequestDTO loanRequest) {
        return null;
    }


}
