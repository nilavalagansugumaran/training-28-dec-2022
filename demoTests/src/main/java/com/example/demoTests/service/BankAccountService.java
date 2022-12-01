package com.example.demoTests.service;

import com.example.demoTests.component.BankAccount;
import com.example.demoTests.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

    @Autowired(required = false)
    BankRepository repository;

    public void  depositToAccount(int accountNumber, double amount) {

        BankAccount account = repository.getBankAccountById(accountNumber);
        account.deposit(amount);
    }
}
