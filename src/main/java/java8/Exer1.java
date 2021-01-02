package java8;

import java.util.Arrays;

public class Exer1 {
    public static void main(String[] args) {
        String[] words = new String[]{
                "ana",
                "radar",
                "lupul",
                "mielul"
        };

        Arrays.stream(words).filter(
                word -> {
                    for(int i = 0; i < word.length()/2; i++) {
                        if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                            return false;
                        }
                    }
                    return true;
                }
        ).forEach(System.out::println);
    }
}
