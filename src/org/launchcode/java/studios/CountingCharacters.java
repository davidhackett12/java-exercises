package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static HashMap<String, Integer> characterCounter() {
        Scanner in;
        in = new Scanner(System.in);
        String file;
        System.out.println("Enter a string of characters");
        file = in.nextLine();
        String str = FileUtils.readFileToString(file);

        HashMap<String, Integer> characterTotal = new HashMap<>();
        String lowerCase = userInput.toLowerCase();
        String[] characters = lowerCase.split("");
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = alpha.split("");
        for (String character : alphabet) {
            Integer characterCount = 0;
            for (String character2 : characters) {
                if (character.equals(character2)) {
                    characterCount += 1;
                }
                if (characterCount > 0) {
                    characterTotal.put(character, characterCount);
                }
            }
        }
        return characterTotal;

    }
    public static void main(String[] arg) {
        HashMap<String, Integer> characterTotal = characterCounter();
        for (Map.Entry<String, Integer> count : characterTotal.entrySet()) {
            System.out.println(count.getKey() + " (" + count.getValue() + ")");
        }

    }
}
