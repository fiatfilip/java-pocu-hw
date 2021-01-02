package java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ParalelStreams {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
        // Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(numbers)
                .parallel()
                .forEach(System.out::println);

        IntStream.rangeClosed(1,5)
                .parallel()
                .forEach(System.out::println);
    }
}
