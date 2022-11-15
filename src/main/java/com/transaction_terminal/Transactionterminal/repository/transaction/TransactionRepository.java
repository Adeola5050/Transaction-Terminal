package com.transaction_terminal.Transactionterminal.repository.transaction;

import com.transaction_terminal.Transactionterminal.model.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

     boolean existsByUserName(String name);
}
