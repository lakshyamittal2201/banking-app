package net.javaSpring.banking_app.repository;

import net.javaSpring.banking_app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {



}
