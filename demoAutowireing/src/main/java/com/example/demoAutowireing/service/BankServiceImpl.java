package com.example.demoAutowireing.service;

import com.example.demoAutowireing.repository.BankRepository;
import com.example.demoAutowireing.repository.CurrentAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService{

    @Value("${name:default name}")
    private String name;

    // property injection
    //@Autowired
    //private BankRepository repository;

//    @Autowired
//    public BankServiceImpl(@Qualifier("currentAccountRepository") BankRepository repository) {
//        this.repository = repository;
//    }

    private List<BankRepository> repository;
    @Autowired
    public BankServiceImpl(List<BankRepository> repository) {
        this.repository = repository;
    }

    @Override
    public void withdraw() {
        System.out.println("Bank service impl - withdraw");
        System.out.println("name is " + name);
        //repository.doWithdraw();

        repository.stream().forEach(s -> {
            s.doWithdraw();
        });
    }
}
