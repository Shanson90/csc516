package homework;

import java.util.ArrayList;

public class WordEncoderV2 {
    public static int minLength(String[] words) { // 831ms
        // seed new list of minimized words
        ArrayList<String> minimized = new ArrayList<>();
        int len = words[0].length() + 1;
        minimized.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < minimized.size(); j++) {
                if (encoded(minimized.get(j), words[i])) {
                    break;
                }
                if (encoded(words[i], minimized.get(j))) {
                    len -= minimized.get(j).length();
                    minimized.remove(j);

                    len += words[i].length();
                    minimized.add(words[i]);
                    break;
                }

                if (j == minimized.size() - 1) {
                    minimized.add(words[i]);
                    len += (words[i].length() + 1);
                    break;
                }
            }
        }

        return len;
    }

    private static boolean encoded(String word, String subWord) {
        if (subWord.length() > word.length()) {
            return false;
        }
        return word.substring(word.length() - subWord.length()).equals(subWord);
    }
}
