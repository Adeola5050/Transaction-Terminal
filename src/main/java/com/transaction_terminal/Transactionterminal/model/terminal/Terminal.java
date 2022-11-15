package com.transaction_terminal.Transactionterminal.model.terminal;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Terminal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String terminalName;
    private String address;
    private String postalCode;
    private String grade;
    private String createdDate;
    private String modifiedDate;


}
