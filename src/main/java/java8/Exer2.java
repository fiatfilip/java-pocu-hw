package java8;

import java.util.stream.IntStream;

public class Exer2 {
    public static void main(String[] args) {
        IntStream.range(2, 101)
                .filter(nr ->  IntStream.rangeClosed(2, (int)Math.sqrt(nr))
                                    .filter(n -> nr%n == 0).count() == 0
                ).forEach(System.out::println);
    }
}
