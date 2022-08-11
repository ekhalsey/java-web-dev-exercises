package org.launchcode.java.ControlFlowStudio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence to count its characters: ");
        String str = input.nextLine();
        //        String str = "If the product of two terms is zero then common sense " +
//                "says at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the quadratics " +
//                "into a form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = str.toLowerCase().toCharArray();
//        for(char character : charactersInString) {
//            System.out.println(character);
//        }
        HashMap<Character, Integer> counting = new HashMap<>();

       String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        char[] alphabetArray = alphabet.toCharArray();

        for (char character : charactersInString) {
            if (!counting.containsKey(character)) {
                counting.put(character, 1);
            } else {
                int numberOfReps = counting.get(character);
                numberOfReps += 1;
                counting.put(character, numberOfReps);
            }

        }
        for (Map.Entry<Character, Integer> pair : counting.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
