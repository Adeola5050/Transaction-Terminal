package com.transaction_terminal.Transactionterminal.service.terminal;

import com.transaction_terminal.Transactionterminal.dto.CreateTerminalDto;
import com.transaction_terminal.Transactionterminal.exception.TransactionTerminalApplicationException;
import com.transaction_terminal.Transactionterminal.model.terminal.Terminal;
import org.springframework.stereotype.Service;

@Service
public interface TerminalService {
    void createTerminal(CreateTerminalDto dto) throws TransactionTerminalApplicationException;


    Terminal findById(Long id) throws TransactionTerminalApplicationException;
}
