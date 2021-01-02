package java8;

import java.util.Arrays;
import java.util.List;

public class LambdaMain {
    public static void main(String[] args) {
        String[] words = new String[]{"albastru", "stea", "astru"};
        List<String> wordsList = Arrays.asList(words);

        for (String word: wordsList) {
            System.out.println(word);
        }
        System.out.println("...");
        wordsList.stream()
                .forEach(word -> { System.out.println(word);});
    }
}
