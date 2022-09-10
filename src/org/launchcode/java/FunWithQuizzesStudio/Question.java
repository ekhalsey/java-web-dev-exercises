package org.launchcode.java.FunWithQuizzesStudio;

import java.util.ArrayList;

public abstract class Question {
    private String questionText;
    private ArrayList<String> answerOptions;
    private ArrayList<String> correctAnswer;
    private int point;

    public Question(String questionText, ArrayList<String> answerOptions, ArrayList<String> correctAnswer) {
        this.questionText = questionText;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }



    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public ArrayList<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public int getPoint() {
        return point;
    }

    public void displayQuestion() {
        System.out.println(this.getQuestionText());
    }
    public abstract void promptForUserAnswer();
    public abstract void displayPossibleAnswers();
    public int checkAnswer(ArrayList<String> userAnswer, int indexOfAnswer) {
        if (this.getCorrectAnswer().get(0).equals(userAnswer.get(indexOfAnswer))) {
            return 1;
        }
        return 0;
    }
}
