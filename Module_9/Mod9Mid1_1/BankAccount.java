package com.Brunoyam.Module_9.Mod9Mid1_1;

public class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    int getBalance() {
        return balance;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    void push(int money) {
        balance += money;
    }

    void pop(int money) {
        balance -= money;
    }
}
