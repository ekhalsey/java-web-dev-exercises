package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double areaOfCircle = 0;
        System.out.println("Enter the radius: ");
        String radiusInput = input.nextLine();
        input.close();

        if (radiusInput.equals("")) {
            System.out.println("Radius cannot be empty.");
        } else if (radiusInput.length() > 0) {
            System.out.println("this is the input value: " + radiusInput);
        }
        try {
            double radiusNum = Double.parseDouble(radiusInput);
            if (radiusNum > 0) {
                areaOfCircle = Circle.getArea(radiusNum);
            } else {
                System.out.println("Something is wrong.");
            }
        } catch (Exception e) {
            System.out.println("successful error");
        }



        //double areaOfCircle = Math.PI * radius * radius;
        System.out.println("The area of a circle with radius " + radiusInput + " is: " + areaOfCircle);
        input.close();
    }
}
