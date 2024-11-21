package com.training.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    // Test Constructor: Normal case
    @Test
    void testConstructorNormal() {
        BankAccount account = new BankAccount(100.0);
        assertEquals(100.0, account.getBalance());
    }

    // Test Constructor: Negative initial balance
    @Test
    void testConstructorNegativeBalance() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount(-50.0));
    }

    // Test Deposit: Normal case
    @Test
    void testDepositNormal() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    // Test Deposit: Zero amount
    @Test
    void testDepositZero() {
        BankAccount account = new BankAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0.0));
    }

    // Test Deposit: Negative amount
    @Test
    void testDepositNegative() {
        BankAccount account = new BankAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
    }

    // Test Withdraw: Normal case
    @Test
    void testWithdrawNormal() {
        BankAccount account = new BankAccount(100.0);
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance());
    }

    // Test Withdraw: Zero amount
    @Test
    void testWithdrawZero() {
        BankAccount account = new BankAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0.0));
    }

    // Test Withdraw: Negative amount
    @Test
    void testWithdrawNegative() {
        BankAccount account = new BankAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-20.0));
    }

    // Test Withdraw: Insufficient balance
    @Test
    void testWithdrawInsufficientBalance() {
        BankAccount account = new BankAccount(100.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
    }

    // Test Withdraw: Exact balance
    @Test
    void testWithdrawExactBalance() {
        BankAccount account = new BankAccount(100.0);
        account.withdraw(100.0);
        assertEquals(0.0, account.getBalance());
    }
}

