package problems.strings;

public class CountOFWordsEndWithVowel {

    public static Integer countOfWordsEndWithVowel (String str) {
        if (str.isEmpty()) return 0;
        int count = 0;
        String[] words = str.split("\\s+");
        for (String word : words) {
            char c = Character.toLowerCase(word.charAt(word.length() - 1));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}
