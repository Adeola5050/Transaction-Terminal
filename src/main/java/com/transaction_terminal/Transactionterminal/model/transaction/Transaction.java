package com.transaction_terminal.Transactionterminal.model.transaction;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String createdDate;
    private String startDate;
    private String endDate;
    private BigDecimal amount;
    private String userName;
    private String modifiedDate;
    @Enumerated
    private TransactionType transactionType;

}
