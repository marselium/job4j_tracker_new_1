package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "New String For Interface";
        System.out.println(supplier.get());
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplier1 = () -> new HashSet<>(list);
        Set<String> strings = supplier1.get();
        for (String string : strings) {
            System.out.println(string);
        }
        Supplier<String> supplier2 = () -> "New str for interface consumer";
        Consumer<String> consumer = (str) -> System.out.println(str);
        consumer.accept(supplier2.get());
        Supplier<String> supplier3 = () -> "New str for biconsumer";
        BiConsumer<String, String> consumer1 = (first, second) -> System.out.println(first + second);
        consumer1.accept(supplier3.get(), " Second str");
        BiConsumer<Integer, String> consumer2 = (first, second) -> System.out.println(first + second);
        int i = 1;
        for (String str : strings) {
            consumer2.accept(i++, " is " + str);
        }
        Predicate<String> predicate = string -> string.isEmpty();
        System.out.println("Строка пустая: " + predicate.test(""));
        System.out.println("Строка пустая: " + predicate.test("test"));
        Function<String, Character> function = string -> string.charAt(2);
        System.out.println("Третий символ в строке: " + function.apply("first"));
        System.out.println("Третий символ в строке: " + function.apply("second"));
        BiFunction<String, Integer, String> biFunction = (string, number) -> string.concat(" ").concat(number.toString());
        System.out.println("Результат работы бифункции: " + biFunction.apply("Name" , 123));
        System.out.println("Результат работы бифункции: " + biFunction.apply("String number" , 12345));
        BinaryOperator<StringBuilder> builder = (first, second) -> first.append(" ").append(second);
        System.out.println(
                "Строка после объединения: " + builder.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }
}
