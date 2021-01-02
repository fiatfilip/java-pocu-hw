package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMain {
    public static void main(String[] args) {
        String[] words = new String[]{"albastru", "stea", "astru"};
        List<String> wordsList = Arrays.asList(words);

        Collections.sort(wordsList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(wordsList, (o1, o2) -> -1 * o1.compareTo(o2));
        Collections.sort(wordsList, Comparator.naturalOrder());
        Collections.sort(wordsList, String::compareTo);

        wordsList.stream()
                .filter(s -> s.contains("astru"))
                .forEach(System.out::println);
    }
}
