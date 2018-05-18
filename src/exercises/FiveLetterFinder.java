package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class FiveLetterFinder {
    public static ArrayList<String> finder(ArrayList<String> wordlist) {
        ArrayList<String> fiveletter;
        fiveletter = new ArrayList<>();
        for(String word : wordlist) {
            if (word.length() == 5) {
                fiveletter.add(word);
            }
        }
        return fiveletter;
    }
    public static void main(String[] args) {
        ArrayList<String> wordlist;
        wordlist = new ArrayList<>(Arrays.asList("david", "john", "haley", "richie", "arthur", "roger"));
        ArrayList<String> result;
        result = finder(wordlist);
        System.out.println(result);

    }
}
