package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Game \"11\".");
        boolean turn = true;
        int cnt = 11;
        System.out.println("Спичек осталось: " + cnt);
        while (cnt > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3: ");
            int matches = inp.nextInt();
            if (matches > 0 && matches <= Math.min(3, cnt)) {
                cnt -= matches;
                System.out.println("Спичек осталось: " + cnt);
                turn = !turn;
            } else {
                System.out.println("Неверное количество");
            }

        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
