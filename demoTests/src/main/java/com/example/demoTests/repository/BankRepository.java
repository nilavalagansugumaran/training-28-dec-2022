package com.example.demoTests.repository;

import com.example.demoTests.component.BankAccount;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository {

    BankAccount getBankAccountById(int id);
}
