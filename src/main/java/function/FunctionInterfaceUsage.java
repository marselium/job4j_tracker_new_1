package function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class FunctionInterfaceUsage {

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }
    @FunctionalInterface
    public interface BiConsumer<T, U> {
        void accept(T t, U u);
    }

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "New String For Interface";
        System.out.println(supplier.get());
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplier1 = () -> new HashSet<>(list);
        Set<String> strings = supplier1.get();
        for (String string : strings) {
            System.out.println(string);
        }
        Supplier<String> supplier2 = () -> "New String for interface";
        Consumer<String> consumer = (str) -> System.out.println(strings);
        consumer.accept(supplier2.get());


    }
}
