package problems.strings;

public class LongestWordInString {

    public static String longestWord(String str) {
        if(str.isEmpty()) return str;
        String[] words = str.split("\\s+");
        int wordIndex = 0 , length = 0;

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > length) {
                length = words[i].length();
                wordIndex = i;
            }
        }

        return words[wordIndex];

    }
}
