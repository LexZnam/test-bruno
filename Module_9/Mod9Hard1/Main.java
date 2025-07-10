package com.Brunoyam.Module_9.Mod9Hard1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Bank.Account account1 = new Bank.Account(12345);
        Bank.Account account2 = new Bank.Account(67890);
        Bank.Account account3 = new Bank.Account(10001);

        bank.checkBankBalanceSumma();

        bank.getMoneyFromBank(account1, 400);
        bank.getMoneyFromBank(account2, 500);
        bank.getMoneyFromBank(account3, 600);

        bank.checkBankBalanceSumma();

        bank.transactionAccToAcc(account1, account3, 100);
        bank.transactionAccToAcc(account3, account1, 900);

    }
}
