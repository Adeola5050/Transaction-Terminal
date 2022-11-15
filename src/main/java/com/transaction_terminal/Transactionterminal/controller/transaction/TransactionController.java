package com.transaction_terminal.Transactionterminal.controller.transaction;

import com.transaction_terminal.Transactionterminal.dto.CreateTransactionDto;
import com.transaction_terminal.Transactionterminal.dto.FindTransactionByDateDto;
import com.transaction_terminal.Transactionterminal.exception.TransactionTerminalApplicationException;
import com.transaction_terminal.Transactionterminal.model.transaction.Transaction;
import com.transaction_terminal.Transactionterminal.repository.transaction.TransactionRepository;
import com.transaction_terminal.Transactionterminal.response.ResponseDetails;
import com.transaction_terminal.Transactionterminal.service.transaction.TransactionServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@Slf4j
@RequestMapping("transactions")
public class TransactionController {
    @Autowired
    TransactionServiceImpl transactionServiceimpl;
    @Autowired
    TransactionRepository transactionRepository;

    @PostMapping("")
    public ResponseEntity<?> createTransaction(@RequestBody CreateTransactionDto dto) throws TransactionTerminalApplicationException {
        transactionServiceimpl.createTransactionObject(dto);

        ResponseDetails responseDetails = new ResponseDetails(LocalDateTime.now(), "Transaction created successfully", "success");
        return new ResponseEntity<>(responseDetails, HttpStatus.CREATED);
    }

    @GetMapping("{username}")
    public ResponseEntity<?> findByUserName(@PathVariable String username) throws TransactionTerminalApplicationException {
        if (username == null) {
            throw new TransactionTerminalApplicationException("User name is null");

        }
        Transaction transaction = transactionServiceimpl.findByUserName(username);
        return new ResponseEntity<>(transaction, HttpStatus.OK);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> findTransactionByDate(@PathVariable Long id) throws TransactionTerminalApplicationException{
        if(id == null){
            throw new TransactionTerminalApplicationException("This transaction id is null");
        }
        FindTransactionByDateDto transaction = transactionServiceimpl.findTransactionByStartAndEndDate(id);
        return new ResponseEntity<>(transaction,HttpStatus.OK);

    }
}
