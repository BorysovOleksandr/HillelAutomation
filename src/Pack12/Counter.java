package Pack12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence");
        String sentence = scanner.nextLine();
        printCountLetters(sentence);
    }

    private static void printCountLetters (String sentence){
        Map<Character,Integer> countLetters = new HashMap<>();
        for (int i=0; i<sentence.length(); i++){
            char letter = sentence.charAt(i);
            if (Character.isLetter(letter)){
              countLetters.put(letter, countLetters.getOrDefault(letter, 0) + 1);}
        }
        System.out.println("Count of letter: ");
        for (Map.Entry<Character, Integer> entry: countLetters.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue() +";");
        }
    }

}