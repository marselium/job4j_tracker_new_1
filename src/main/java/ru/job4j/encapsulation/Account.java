package ru.job4j.encapsulation;

public class Account {
    int balance;

    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }
}
