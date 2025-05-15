package problems.strings;

public class EvenWordsCount {

    public static Integer evenLengthWords(String str) {
        if(str.isEmpty()) return 0;
        String[] words = str.split("\\s+");
        int count = 0;


        for(String word : words) {
            if(word.length() % 2 == 0){
                count ++;
            }
        }


        return count;
    }
}
