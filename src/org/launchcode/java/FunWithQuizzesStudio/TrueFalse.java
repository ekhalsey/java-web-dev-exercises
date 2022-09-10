package org.launchcode.java.FunWithQuizzesStudio;

import java.util.ArrayList;

public class TrueFalse extends Question{

    public TrueFalse(String questionText, ArrayList<String> answerOptions, ArrayList<String> correctAnswer) {
        super(questionText, answerOptions, correctAnswer);
    }

    @Override
    public void promptForUserAnswer() {
        System.out.println("Enter \"t\" for True or \"f\" for False");
    }

    @Override
    public void displayPossibleAnswers() {
            System.out.println("True or false");
    }

}
