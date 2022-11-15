package com.transaction_terminal.Transactionterminal.repository.terminal;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.transaction_terminal.Transactionterminal.exception.TransactionTerminalApplicationException;
import com.transaction_terminal.Transactionterminal.model.terminal.Terminal;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TerminalRepository extends JpaRepository<Terminal, Long> {

    @Override
    Optional<Terminal> findById(Long id);


}
