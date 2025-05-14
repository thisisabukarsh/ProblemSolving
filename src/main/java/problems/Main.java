package problems;

public class Main {
    public static void main(String[] args) {

    }

    public static String reversString(String str){
        // input = adbulrahman ABU Karsh

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(words[i].toUpperCase())) {
                words[i] = reversWord(words[i]); // sol 1
//                words[i] = new StringBuilder(words[i]).reverse().toString(); // sol 2
            }
        }

        return String.join(" ", words);
    }

    private static String reversWord(String word){
        char[] chars = word.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;

        }
        return  new String(chars);
    }

    public static String reversNumbersInString (String str){
        // input = "hello 123 45world 6789 java"
        // output = "hello 321 45world 9876 java"
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();

            boolean isAllDigit = true;

            for (Character c : chars) {
                if(!Character.isDigit(c)){
                    isAllDigit = false;
                    break;
                }
            }

            if(isAllDigit){
            words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }

    public  static  String reversNumbersInWord (String str) {
        String[] words = str.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();

            StringBuilder digits = new StringBuilder();
            StringBuilder letters = new StringBuilder();

            for (Character c : chars) {
                if(Character.isDigit(c)){
                    digits.append(c);
                }
                else if(Character.isLetter(c)){
                    letters.append(c);
                }
            }

            words[i] = digits.toString() +"  " +letters.toString();

        }

        return String.join(" ", words);
    }

    public static String longestWord (String str) {
        String[] words = str.split("\\s+");

        int count = 0, wordIndex = 0 ;

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > count) {
                wordIndex = i;
                count = words[i].length();
            }

        }

        return words[wordIndex];
        //done in 4.58 min


    }

    public  static Integer capitalWordsCount (String str) {
        String[] words = str.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                count++;
            }

        }

        return count;
    //       done in 2.58 min
    }

    public static Integer vowelsCount (String str) {
        String[] words = str.split("\\s+");
        int count = 0;

        for(int i = 0; i < words.length; i++){

            if(isVowel(words[i].charAt(words[i].length()-1))){
                count++;
            }
        }

        return count;
//        done in 4.23 min
    }

    public static boolean isVowel (char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e'  || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }else  {
            return false;
        }

    }

    public static Integer evenLengthWords(String str) {
        String[] words = str.split("\\s+");

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                count++;
            }
        }

        return count;
//        done in 1.4 min
    }




}