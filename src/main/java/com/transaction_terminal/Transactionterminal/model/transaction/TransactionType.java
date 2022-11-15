package com.transaction_terminal.Transactionterminal.model.transaction;

import javax.persistence.Enumerated;

public enum TransactionType {
    @Enumerated
    PAID, DEPOSIT, CREDIT
}
