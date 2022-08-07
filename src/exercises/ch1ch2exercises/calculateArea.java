package exercises.ch1ch2exercises;
import java.util.Scanner;

public class calculateArea {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle: ");
        float length = input.nextFloat();
        System.out.println("Enter the width of your rectangle: ");
        float width = input.nextFloat();
        System.out.println("The area is: " + (length * width));
    }
}
