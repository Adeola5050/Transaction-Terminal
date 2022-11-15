package com.transaction_terminal.Transactionterminal.service.transaction;

import com.transaction_terminal.Transactionterminal.dto.CreateTransactionDto;
import com.transaction_terminal.Transactionterminal.exception.TransactionTerminalApplicationException;
import com.transaction_terminal.Transactionterminal.model.terminal.Terminal;
import com.transaction_terminal.Transactionterminal.model.transaction.Transaction;
import com.transaction_terminal.Transactionterminal.model.transaction.TransactionType;
import com.transaction_terminal.Transactionterminal.repository.terminal.TerminalRepository;
import com.transaction_terminal.Transactionterminal.repository.transaction.TransactionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    TerminalRepository terminalRepository;
    @Autowired
    TransactionRepository transactionRepository;

    private Terminal findById(Long id) throws TransactionTerminalApplicationException{
       return terminalRepository.findById(id).orElseThrow(()-> new TransactionTerminalApplicationException("This terminal does not exist"));


    }
    @Override
    public void createTransactionObject(CreateTransactionDto dto) throws TransactionTerminalApplicationException {
        Transaction transaction= new Transaction();
        transaction.setTransactionType(TransactionType.valueOf(dto.getTransactionType()));
        transaction.setAmount(dto.getAmount());
        transaction.setStartDate(dto.getStartDate());
        transaction.setEndDate(dto.getEndDate());
        transaction.setUserName(dto.getUserName());
        transaction.setCreatedDate(LocalDateTime.now().toString());
        transaction.setModifiedDate(LocalDateTime.now().toString());
        transactionRepository.save(transaction);


    }
    public Transaction findByUserName(String name) throws TransactionTerminalApplicationException {
            return transactionRepository.findByUserName(name);

    }



    }
