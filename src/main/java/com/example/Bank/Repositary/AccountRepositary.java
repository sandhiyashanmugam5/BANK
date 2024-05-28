package com.example.Bank.Repositary;

import com.example.Bank.Bank.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepositary extends JpaRepository<Account,Long> {
}
