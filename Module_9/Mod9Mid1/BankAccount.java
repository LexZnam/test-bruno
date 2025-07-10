package com.Brunoyam.Module_9.Mod9Mid1;

public class BankAccount {
    private int balance;

    int getBalance() {
        return balance;
    }

    BankAccount(int balance) {
        this.balance = balance;
    }

    void push(int money) {
        balance += money;
    }

    void pop(int money) {
        if (balance >= money) {
            balance -= money;
        } else {
            System.out.println("На счете недостаточно средств");
        }
    }
}

