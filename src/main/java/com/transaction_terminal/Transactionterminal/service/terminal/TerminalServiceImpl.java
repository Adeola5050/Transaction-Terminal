package com.transaction_terminal.Transactionterminal.service.terminal;

import com.transaction_terminal.Transactionterminal.dto.CreateTerminalDto;
import com.transaction_terminal.Transactionterminal.exception.TransactionTerminalApplicationException;
import com.transaction_terminal.Transactionterminal.model.terminal.Terminal;
import com.transaction_terminal.Transactionterminal.repository.terminal.TerminalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class TerminalServiceImpl implements TerminalService {
    @Autowired
    TerminalRepository terminalRepository;

    @Override
    public void createTerminal(CreateTerminalDto dto) throws TransactionTerminalApplicationException {
        Terminal terminal = new Terminal();
        terminal.setCreatedDate(LocalDate.now().toString());
        terminal.setModifiedDate(LocalDate.now().toString());
        terminal.setTerminalName(dto.getTerminalName());
        terminal.setCreatedDate(LocalDate.now().toString());
        terminal.setAddress(dto.getAddress());
        terminal.setPostalCode(dto.getPostalCode());
        terminal.setGrade(dto.getGrade());
        terminalRepository.save(terminal);

    }

    @Override
    public Terminal findById(Long id) throws TransactionTerminalApplicationException {
        return terminalRepository.findById(id).orElseThrow(() ->
                new TransactionTerminalApplicationException("This terminal does not exist in the database"));
    }

}

