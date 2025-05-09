package ru.job4j.oop;

public class Jukebox {
    public void music(int pos) {
        if (pos == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (pos == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox customerChoice = new Jukebox();
        customerChoice.music(1);
        customerChoice.music(2);
        customerChoice.music(3);
        customerChoice.music(10);
    }
}
