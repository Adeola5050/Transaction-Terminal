package com.transaction_terminal.Transactionterminal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TransactionTerminalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionTerminalApplication.class, args);
	}

}
