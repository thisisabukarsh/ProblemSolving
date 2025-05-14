package problems.strings;

public class ReversNumbersInString {

    public static String reversNumbersInString (String str){
        if(str.isEmpty()){return str;}

        String[] words = str.split("\\s+");

        for(int i = 0 ; i < words.length; i++){
            char[] chars = words[i].toCharArray();
            boolean allDigit = true;
            for(int j = 0 ; j < chars.length; j++){
                if(!Character.isDigit(chars[j])){
                    allDigit = false;
                    break;
                }
            }
            if(allDigit){
                int left = 0, right = chars.length - 1;

                while (left < right){
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }

                words[i] = new String(chars);
            }

//            sol2
//            if(allDigit){
//                words[i] = new StringBuilder(words[i]).reverse().toString();
//            }

        }

        return String.join(" ", words);
    }
}
