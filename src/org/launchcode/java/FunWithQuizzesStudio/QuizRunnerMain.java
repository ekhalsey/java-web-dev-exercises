package org.launchcode.java.FunWithQuizzesStudio;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunnerMain {
    public static void main(String[] args) {
        Quiz theQuiz = new Quiz();

        ArrayList<String> possibleAnswers1 = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth"));
        ArrayList<String> correctAnswer1 = new ArrayList<>(Arrays.asList("c"));
        Question question1 = new MultipleChoice("On which planet do we live?", possibleAnswers1, correctAnswer1);
        theQuiz.addQuestion(question1);

        //question1.displayPossibleAnswers();

        ArrayList<String> possibleAnswers2 = new ArrayList<>(Arrays.asList("Jupiter", "Saturn", "Tattooine", "Planet Hollywood"));
        ArrayList<String> correctAnswer2 = new ArrayList<>(Arrays.asList("34"));
        Question question2 = new Checkbox("Which are NOT planets in our solar system?", possibleAnswers2, correctAnswer2);
        theQuiz.addQuestion(question2);

        ArrayList<String> possibleAnswers3 = new ArrayList<>(Arrays.asList("t", "f"));
        ArrayList<String> correctAnswer3 = new ArrayList<>(Arrays.asList("t"));
        Question question3 = new TrueFalse("Steve Buscemi is an alien.", possibleAnswers3, correctAnswer3);
        theQuiz.addQuestion(question3);

        theQuiz.runQuiz();
    }
}
