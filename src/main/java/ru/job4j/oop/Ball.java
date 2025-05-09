package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean cond) {
        if (cond) {
            System.out.println("Kolobok was eaten");
        } else {
            System.out.println("Kolobok run away");
        }
    }
}
