package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    private static int minus(int y) {
        return x - y;
    }

    private int multiply(int y) {
        return x * y;
    }

    private int divide(int y) {
        return y / x;
    }

    private int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println("Sum " + result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println("Multiply " + result);
        result = Calculator.minus(1);
        System.out.println("Minus " + result);
        result = calculator.divide(10);
        System.out.println("Divide " + result);
        result = calculator.sumAllOperation(10);
        System.out.println("Sum of all op " + result);
    }
}