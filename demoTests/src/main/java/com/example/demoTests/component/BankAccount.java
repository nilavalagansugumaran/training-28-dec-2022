package com.example.demoTests.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankAccount {

    private double balance = 0;

    public void deposit(double amount) {
        balance = balance + amount;
    }
}
