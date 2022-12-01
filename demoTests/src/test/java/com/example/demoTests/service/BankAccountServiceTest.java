package com.example.demoTests.service;

import com.example.demoTests.component.BankAccount;
import com.example.demoTests.repository.BankRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.dao.DataAccessException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class BankAccountServiceTest {

    @MockBean
    BankRepository repository;

    @Autowired
    BankAccountService service;

    @Test
    void testDeposit(){
        //given
        BankAccount ba = new BankAccount();
        when(repository.getBankAccountById(anyInt())).thenReturn(ba);
        //when(repository.getBankAccountById(anyInt())).thenThrow(new RuntimeException("ERROR"));

        //when
        service.depositToAccount(1234, 200);

        //then
        assertEquals(200, ba.getBalance());
        verify(repository).getBankAccountById(anyInt());
    }
}