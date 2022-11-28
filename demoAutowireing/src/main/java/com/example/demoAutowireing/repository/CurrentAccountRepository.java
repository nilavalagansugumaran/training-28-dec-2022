package com.example.demoAutowireing.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CurrentAccountRepository implements BankRepository{

    @Override
    public void doWithdraw() {
        System.out.println("Current account - withdraw");
    }
}
