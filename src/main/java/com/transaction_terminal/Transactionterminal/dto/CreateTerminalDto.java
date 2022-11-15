package com.transaction_terminal.Transactionterminal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTerminalDto {
    private String startDate;
    private String endDate;
    private String terminalName;
    private String address;
    private String postalCode;
    private String grade;


}
