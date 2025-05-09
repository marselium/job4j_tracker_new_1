package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public void prediction(String input) {
        Random random = new Random();
        int val = random.nextInt(3);
        if (val == 0) {
            System.out.println("Yes");
        } else if (val == 1) {
            System.out.println("No");
        } else if (val == 2) {
            System.out.println("Maybe");
        }
    }

    public static void main(String[] args) {
        MagicBall ball = new MagicBall();
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your question: ");
        String input = in.nextLine();
        ball.prediction(input);
    }
}
