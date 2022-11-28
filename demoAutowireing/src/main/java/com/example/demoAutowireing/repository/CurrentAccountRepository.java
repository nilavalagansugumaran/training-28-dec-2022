package com.example.demoAutowireing.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Repository;

@Repository
public class CurrentAccountRepository implements BankRepository{

    private ApplicationArguments applicationArguments;

    @Autowired
    public CurrentAccountRepository(ApplicationArguments applicationArguments) {
        this.applicationArguments = applicationArguments;
    }

    @Override
    public void doWithdraw() {
        System.out.println("Current account - withdraw");
        System.out.println(applicationArguments.getNonOptionArgs());
        System.out.println(applicationArguments.getOptionNames());
    }
}
