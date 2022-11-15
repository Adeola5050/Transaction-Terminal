package com.transaction_terminal.Transactionterminal.service.transaction;

import com.transaction_terminal.Transactionterminal.dto.CreateTransactionDto;
import com.transaction_terminal.Transactionterminal.exception.TransactionTerminalApplicationException;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {

    void createTransactionObject(CreateTransactionDto dto) throws TransactionTerminalApplicationException;

//    boolean findByUserName(String name) throws TransactionTerminalApplicationException;
}
