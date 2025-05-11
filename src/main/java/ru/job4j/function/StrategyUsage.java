package ru.job4j.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class StrategyUsage {

    public boolean check(Predicate<String> predicate, String string) {
        return predicate.test(string);
    }

    public String transform(Function<String, String> function, String str) {
        return function.apply(str);
    }

    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        System.out.println(
                "Результат работы: "
                        + usage.check(s -> s.isEmpty(), "")
        );
        System.out.println("Результат работы: "
                + usage.check(s -> s.startsWith("Fun"),"Functional interface")
        );
        System.out.println("Результат работы: "
                + usage.check(s -> s.contains("rn"), "Surname Name"));
        System.out.println();
        System.out.println("Строка после преобразования: "
                        + usage.transform(s -> s.toUpperCase(),"asdDWSD")
                );
        System.out.println(
            usage.transform(s -> s.concat("работает корректно."), "Строка после преобразования: ")
        );
        System.out.println("Строка после преобразования: "
                + usage.transform(s -> s.trim(), "            test trim"));
    }
}