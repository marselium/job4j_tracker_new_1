package ru.job4j.varargs;

import java.util.StringJoiner;

public class VarArgs {

    public static String textConcat(String... strings) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (String string: strings) {
            stringJoiner.add(string);
        }
        return stringJoiner + "; Количество соединенных элементов: " + strings.length;
    }

    public static String textConcat(int x, String... strings) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (String string: strings) {
            stringJoiner.add(string);
        }
        return "first arg: " + x + ";\t\t" + stringJoiner + "; Количество соединенных элементов: " + strings.length;
    }

    public static void main(String[] args) {
        String str = textConcat("a1");
        System.out.println(str);
        str = textConcat("a1", "b2");
        System.out.println(str);
        str = textConcat("a1", "b2", "c3");
        System.out.println(str);
        str = textConcat(123, "a1", "b2", "c3");
        System.out.println(str);
    }

}
