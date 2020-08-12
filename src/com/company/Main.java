package com.company;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account(200);
        Account account2 = new Account(100);

        System.out.println("Деньги первого " + account1.getCountOfMoney());
        System.out.println("Деньги второго " + account2.getCountOfMoney());

        Bank.transfer(account1, account2, 225);

        System.out.println("Деньги первого " + account1.getCountOfMoney());
        System.out.println("Деньги второго " + account2.getCountOfMoney());
    }
}
