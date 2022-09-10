package org.launchcode.java.FunWithQuizzesStudio;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private int currentPointsAwarded;
    public ArrayList<Question> questionCollection = new ArrayList<>();
    private ArrayList<String> userAnswer = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public Quiz() {
    }

    public ArrayList<Question> getQuestionCollection() {
        return questionCollection;
    }

    public void setQuestionCollection(ArrayList<Question> questionCollection) {

        this.questionCollection = questionCollection;
    }

    public void addQuestion(Question questionToAdd){
        this.questionCollection.add(questionToAdd);
    }

    public void runQuiz() {
        int counter = 0;
        for (Question q: questionCollection) {
            q.displayQuestion();
            q.displayPossibleAnswers();
            q.promptForUserAnswer();
            userAnswer.add(input.nextLine());
//            System.out.println(userAnswer.get(counter));
//            System.out.println(q.getCorrectAnswer().get(0));
            currentPointsAwarded += q.checkAnswer(userAnswer, counter);
            counter++;

        }
        System.out.println(gradeQuiz(currentPointsAwarded));
        input.close();
    }

    public String gradeQuiz(int pointsEarned) {
        // call gradeQuiz in runQuiz? or just call at end to display grade? we have it set up to grade each answer as its answered.
        return "You scored " + pointsEarned + " out of " + questionCollection.size() + " possible points.";
    }
}
