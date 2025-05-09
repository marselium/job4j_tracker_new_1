package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("job4j");
        for (int i = 0; i < 10000; i++) {
            builder.append(i);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}
