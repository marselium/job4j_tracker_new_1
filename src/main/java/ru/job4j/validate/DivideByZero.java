package ru.job4j.validate;

public class DivideByZero {
    public static int divide(int first, int second) {
        int rsl = -1;
        if (second != 0) {
            return first / second;
        } else {
            System.out.println("Div by 0, return def value -1");
        }
        return rsl;
    }

    public static void main(String[] args) {
        int result = divide(10, 5);
        System.out.println(result);
    }
}