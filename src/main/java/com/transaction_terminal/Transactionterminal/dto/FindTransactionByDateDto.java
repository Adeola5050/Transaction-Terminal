package com.transaction_terminal.Transactionterminal.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindTransactionByDateDto {
    private String startDate;
    private String endDate;
}
