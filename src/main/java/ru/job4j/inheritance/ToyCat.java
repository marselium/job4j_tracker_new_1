package ru.job4j.inheritance;

public class ToyCat extends Cat {
    public boolean canBeWashByWashMachine() {
        return true;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        ToyCat toy = new ToyCat();
        cat.canPurr();
        toy.canPurr();
        toy.canBeWashByWashMachine();
    }
}