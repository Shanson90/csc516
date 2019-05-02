package homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordEncoderV3 {
    public static int minLength(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        int count = 0;

        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                set.remove(word.substring(i));
            }
        }

        for (String word : set) {
            count += word.length();
        }

        return count + set.size();
    }
}
