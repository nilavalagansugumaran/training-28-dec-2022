package com.example.demoAutowireing.repository;

import org.springframework.stereotype.Repository;

@Repository
public class SavingsAccountRepository implements BankRepository{

    @Override
    public void doWithdraw() {
        System.out.println("savings account - withdraw");
    }
}
