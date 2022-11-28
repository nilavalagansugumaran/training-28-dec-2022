package com.example.demoAutowireing.service;

import com.example.demoAutowireing.repository.BankRepository;
import com.example.demoAutowireing.repository.CurrentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService{

    // property injection
    //@Autowired
    private BankRepository repository;

    @Autowired
    public BankServiceImpl(@Qualifier("currentAccountRepository") BankRepository repository) {
        this.repository = repository;
    }

    @Override
    public void withdraw() {
        System.out.println("Bank service impl - withdraw");
        repository.doWithdraw();
    }
}
