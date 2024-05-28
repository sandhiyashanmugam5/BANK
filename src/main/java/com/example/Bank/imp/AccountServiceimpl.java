package com.example.Bank.imp;

import com.example.Bank.Service.AccountsService;
import com.example.Bank.Repositary.AccountRepositary;
import com.example.Bank.dto.AccountDto;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceimpl implements AccountsService {
    private AccountRepositary accountRepositary;

    public AccountServiceimpl(AccountRepositary accountRepositary) {
        this.accountRepositary = accountRepositary;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
