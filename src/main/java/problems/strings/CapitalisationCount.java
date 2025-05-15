package problems.strings;

public class CapitalisationCount {

    public static Integer capitalisationCount(String str){
        int count = 0;
        if(str.isEmpty()) return 0;
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }
        return count;
    }
}
