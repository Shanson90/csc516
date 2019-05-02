package homework;

import java.util.ArrayList;

public class WordEncoderV1 {
    public static int minLength(String[] words) { // 822ms
        ArrayList<String> minimized = new ArrayList<>();

        // seed new list of minimized with longest word
        String longest = findLongest(words);
        minimized.add(longest);

        // seed len to return with length of longest word
        int len = longest.length() + 1;

        String testWord = "";
        for (int i = 0; i < words.length; i++) {
            testWord = words[i];
            for (int j = 0; j < minimized.size(); j++) {
                if (encoded(minimized.get(j), testWord)) {
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
                    minimized.add(testWord);
                    len += (testWord.length() + 1);
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

    private static String findLongest(String[] wordsArray) {
        int longestLen = 0;
        int arrayLongestIndex = 0;

        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() > longestLen) {
                longestLen = wordsArray[i].length();
                arrayLongestIndex = i;
            }
        }

        return wordsArray[arrayLongestIndex];
    }
}
