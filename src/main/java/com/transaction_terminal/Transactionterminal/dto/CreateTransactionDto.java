package com.transaction_terminal.Transactionterminal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateTransactionDto {
    private String startDate;
    private String endDate;
    private BigDecimal amount;
    private String transactionType;
    private String userName;
}
