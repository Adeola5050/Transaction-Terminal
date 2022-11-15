package com.transaction_terminal.Transactionterminal.controller.terminal;

import com.transaction_terminal.Transactionterminal.dto.CreateTerminalDto;
import com.transaction_terminal.Transactionterminal.exception.TransactionTerminalApplicationException;
import com.transaction_terminal.Transactionterminal.model.terminal.Terminal;
import com.transaction_terminal.Transactionterminal.response.ResponseDetails;
import com.transaction_terminal.Transactionterminal.service.terminal.TerminalServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@Slf4j
@RequestMapping("terminals")
public class TerminalController {
    @Autowired
    TerminalServiceImpl terminalServiceimpl;

    @PostMapping("")
    public ResponseEntity<?> createTerminalObject(@RequestBody CreateTerminalDto dto) throws TransactionTerminalApplicationException{
        terminalServiceimpl.createTerminal(dto);

        ResponseDetails responseDetails= new ResponseDetails(LocalDateTime.now(),"Terminal created successfully", "success");
        return new ResponseEntity<>(responseDetails, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findTerminalById(@PathVariable Long id) throws  TransactionTerminalApplicationException{
        if(id==null){
            throw  new TransactionTerminalApplicationException("Id cannot be null");
        }
        Terminal terminal=terminalServiceimpl.findById(id);
        return  new ResponseEntity<>(terminal,HttpStatus.OK);
    }
}
