package exercises.ch3ControlFlow;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(16);
        numbers.add(12);
        numbers.add(125);
        numbers.add(159);
        numbers.add(24);
        numbers.add(2);
        numbers.add(9);
        numbers.add(43);
        numbers.add(3);

        System.out.println(sumEven(numbers));

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("coffee");
        words.add("water");
        words.add("glass");
        words.add("donut");
        words.add("chandelier");
        words.add("helicopter");

//        fiveLetterPrint(words);
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word length: ");
        int wordLength = input.nextInt();
        PrintIfLength(words, wordLength);

    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer: arr) {
            if(integer%2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void fiveLetterPrint (ArrayList<String> arr, int wordLength) {

        for (String word : arr) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }

    public static void PrintIfLength (ArrayList<String> arr, int wordLength) {

        for (String word : arr) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
