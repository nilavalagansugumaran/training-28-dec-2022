package com.example.demoTests.component;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BankAccountTest {

    @Autowired
    BankAccount bankAccount;

    @Test
    void testDeposit(){
        //given
        double expectedBalance = 200;

        //when
        bankAccount.deposit(100);
        bankAccount.deposit(100);

        //then
        assertEquals(expectedBalance, bankAccount.getBalance());
    }

}