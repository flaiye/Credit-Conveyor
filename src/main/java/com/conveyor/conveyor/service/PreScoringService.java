package com.conveyor.conveyor.service;

import com.conveyor.conveyor.dto.LoanApplicationRequestDTO;
import com.conveyor.conveyor.dto.LoanOfferDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Service
public class PreScoringService {

    private BigDecimal DEFAULT_RATE = new BigDecimal(0.2);
    private BigDecimal SALARY_RATE_REDUCER = new BigDecimal(0.01);
    private BigDecimal INSURANCE_RATE_REDUCER = new BigDecimal(0.2);

    public List<LoanOfferDTO> preCalculation(LoanApplicationRequestDTO loanRequest) {
        List<LoanOfferDTO> offerList = new ArrayList<>();

        offerList.add(LoanOfferDTO
                .builder()
                .applicationId(1L)
                .requestedAmount(loanRequest.getAmount())
                .totalAmount()
                .term()
                .monthlyPayment()
                .rate()
                .isInsuranceEnabled()
                .isSalaryClient()
                .build()
        );
        return null;
    }

    //TODO: передавать не кучу параметров, а объект
    private BigDecimal calculateTotalAmount(
            BigDecimal amount,
            Integer term,
            Boolean isUnsurenceEnabled,
            Boolean isSalaryEnabled
    ) {
//TODO: Упрощенная формула. Будет переделана на реальную

        BigDecimal updatedRate = DEFAULT_RATE;

        if (isSalaryEnabled) {
            updatedRate = updatedRate.subtract(SALARY_RATE_REDUCER);
        }
        if (isUnsurenceEnabled) {
            updatedRate = updatedRate.subtract(INSURANCE_RATE_REDUCER);
        }
        BigDecimal totalAmount = amount
                .multiply((updatedRate
                        .add(new BigDecimal(1)))
                        .setScale(2, RoundingMode.HALF_UP));
        return totalAmount;
    }
}
