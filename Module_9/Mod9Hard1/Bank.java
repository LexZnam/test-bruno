package com.Brunoyam.Module_9.Mod9Hard1;

class Bank {

    private final int maxSumma = 1000;
    private int bankBalanceSumma = 0;

    public int getMaxSumma() {
        return maxSumma;
    }

    public int getBankBalanceSumma() {
        return bankBalanceSumma;
    }

    Bank() {
        bankBalanceSumma = maxSumma;
    }

    int getMoneyFromBank(Account accountTo, int money) {
        if (getBankBalanceSumma() >= money) {
            accountTo.push(money);
            accountTo.checkAccountBalance();
            bankBalanceSumma -= money;
            checkBankBalanceSumma();
        } else {
            System.out.println("Невозможно перевести сумму, в банке недостаточно средств");
        }
        return money;
    }

    int transactionAccToAcc(Account accountFrom, Account accountTo, int money) {
        if (money > 0 && accountFrom.getBalance() >= money) {
            System.out.println("Проведена транзакция:");
            accountFrom.pop(money);
            accountFrom.checkAccountBalance();
            accountTo.push(money);
            accountTo.checkAccountBalance();
            System.out.println("Переведена сумма " + money + " со счета " + accountFrom.getId() + " на счет " + accountTo.getId());
            System.out.println("------------");
        } else {
            System.out.println("Недостаточно средств. Невозможно перевести " + money + " со счета " + accountFrom.getId() + " на счет " + accountTo.getId());
            System.out.println("------------");
        }
        return money;
    }

    void checkBankBalanceSumma() {
        System.out.println("В банке доступно средств: " + getBankBalanceSumma());
        System.out.println("------------");
    }

    public static class Account {
        private int id;
        private int balance = 0;

        public Account(int id) {
            this.id = id;
        }

        public int getBalance() {
            return balance;
        }

        public int getId() {
            return id;
        }

        boolean push(int money) {
            if (money >0) {
                balance+=money;
                return true;
            }
            return false;
        }

        boolean pop(int money) {
            if (money > 0 && balance >= money) {
                balance-=money;
                return true;
            }
            return false;
        }

        void checkAccountBalance() {
            System.out.println("На счете " + getId() + " баланс: " + getBalance());
        }
    }


}
