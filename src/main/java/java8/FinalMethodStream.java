package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FinalMethodStream {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 7)
                .map(x -> {
                    System.out.println(x);
                    return 2 * x;
                })
                .forEach(System.out::println);

        List<String> unique = Arrays.stream(new String[]{"ana", "dana", "ioana", "ana"})
                .distinct()
                //.forEach(System.out::println);
                .collect(Collectors.toList());

        int suma = IntStream.range(4,6).reduce(0, (x, y) -> x + (int)Math.pow(y, 2));
        System.out.println(suma);

        int factorial = IntStream.rangeClosed(1, 5).reduce(1, (x, y) -> x*y);
        System.out.println(factorial);
    }
}
