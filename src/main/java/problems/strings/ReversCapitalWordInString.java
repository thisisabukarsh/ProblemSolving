package problems.strings;

public class ReversCapitalWordInString {

    public static  String reversCapitalWordInString(String str){
        if(str.isEmpty()) return "";

        String[] words = str.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(words[i].toUpperCase())) {
                char[] charArray = words[i].toCharArray();
                int left = 0 , right = charArray.length - 1;
                while (left < right) {
                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    left++;
                    right--;
                }

                words[i] = new String(charArray);
            }

        }

        return String.join(" ", words);

    }

}
