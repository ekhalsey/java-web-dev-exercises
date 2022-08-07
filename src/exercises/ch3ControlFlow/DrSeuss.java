package exercises.ch3ControlFlow;
import java.util.Arrays;

public class DrSeuss {
    public static void main (String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arraySentence = sentence.split("\\.");
        System.out.println(Arrays.toString(arraySentence));
    }
}
