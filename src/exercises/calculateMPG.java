package exercises;
import java.util.Scanner;

public class calculateMPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        float milesDriven = input.nextFloat();
        System.out.println("How much gas have you used? (in gallons)");
        float gallonsOfGas = input.nextFloat();
        System.out.println("Your MPG is " + (milesDriven/gallonsOfGas));
    }
}
