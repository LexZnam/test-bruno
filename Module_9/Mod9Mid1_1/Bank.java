package com.Brunoyam.Module_9.Mod9Mid1_1;

public class Bank {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        BankAccount[] bankAccounts = new BankAccount[10];
        bankAccounts[0] = new BankAccount(1000);
        bankAccounts[1] = new BankAccount(2000);
        bankAccounts[2] = new BankAccount(2000);
        bankAccounts[3] = new BankAccount(4000);
        bankAccounts[4] = new BankAccount(9000);
        bankAccounts[5] = new BankAccount(1000);
        bankAccounts[6] = new BankAccount(0);
        bankAccounts[7] = new BankAccount(3450);
        bankAccounts[8] = new BankAccount(4000);
        bankAccounts[9] = new BankAccount(9000);


        transaction.transferMoney(bankAccounts[0], bankAccounts[1], 1000);
        transaction.transferMoney(bankAccounts[3], bankAccounts[6], 2000);
        transaction.transferMoney(bankAccounts[7], bankAccounts[9], 90000);


    }


}

class Transaction {
    void transferMoney(BankAccount bankAccountFrom, BankAccount bankAccountTo, int money) {
        if (bankAccountFrom.getBalance() >= money) {
            bankAccountFrom.pop(money);
            bankAccountTo.push(money);
            System.out.println("Успешно. Переведено: " + money);
        } else {
            System.out.println("На счете недостаточно средств");
        }
    }

}
