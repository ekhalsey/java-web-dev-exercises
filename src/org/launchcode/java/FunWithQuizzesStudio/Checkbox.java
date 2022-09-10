package org.launchcode.java.FunWithQuizzesStudio;

import java.util.ArrayList;

public class Checkbox extends Question {

    public Checkbox(String questionText, ArrayList<String> answerOptions, ArrayList<String> correctAnswer) {
        super(questionText, answerOptions, correctAnswer);
    }

    @Override
    public void promptForUserAnswer() {
        System.out.println("Enter numbers corresponding to selected answers. (For example enter \"123\" to select answers 1, 2, and 3.)");
    }

    @Override
    public void displayPossibleAnswers() {
        int counter = 1;
        for (String possibleAnswer : getAnswerOptions()) {

            System.out.println("[" + counter + "] " + possibleAnswer);
            counter++;
        }
    }

}
