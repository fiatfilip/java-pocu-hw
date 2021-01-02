package java8;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Ioan", "Elena", "Marcela");

        // System.out.println(names.findFirst().get());

        // names.filter(x -> x.endsWith("a")).forEach(System.out::println);

        Supplier<Stream<String>> supplier = () -> Stream.of("Ioan", "Elena", "Marcela");
        supplier.get().filter(x -> x.endsWith("na")).forEach(System.out::println);
        System.out.println(supplier.get().findFirst().get());

    }
}
