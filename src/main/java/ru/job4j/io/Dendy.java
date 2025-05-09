package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры.");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.print("Введите пункт меню, чтобы начать игру: ");
            int select = input.nextInt();
            if (select == 1) {
                System.out.println("WoT");
            } else if (select == 2) {
                System.out.println("Mario");
            } else if (select == 3) {
                run = false;
            } else {
                System.out.println("Unknown game");
            }
        }
    }
}
