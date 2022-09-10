package org.launchcode.java.FunWithQuizzesStudio;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    public MultipleChoice(String questionText, ArrayList<String> answerOptions, ArrayList<String> correctAnswer) {
        super(questionText, answerOptions, correctAnswer);
    }

    @Override
    public void promptForUserAnswer() {
        System.out.println("Enter a single letter corresponding to selected answer.");
    }


    @Override
    public void displayPossibleAnswers() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        alphabet.toCharArray();
        int counter = 0;
        for (String possibleAnswer : getAnswerOptions()) {

            System.out.println("\t" + alphabet.toCharArray()[counter] + ". " + possibleAnswer);
            counter++;
        }
        System.out.println();
    }

}
