package exercises.ch3ControlFlow;

public class ArrayPractice {

    public static void main (String[] args) {
        int[] arrayOfInts = {1, 1, 2, 3, 5, 8};
        for (int i : arrayOfInts) {
            if (i%2 != 0) {
                System.out.println(i);
            }

        }
    }
}
