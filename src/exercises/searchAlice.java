package exercises;
import java.util.Scanner;

public class searchAlice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures or conversations in " +
                "it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter word you would like to search: ");
        String searchWord = input.nextLine();
//        if (firstLine.toLowerCase().contains(searchWord.toLowerCase())) {
//            System.out.println("True. " + searchWord + " is found in the literary selection.");
//        } else {
//            System.out.println(searchWord + " is not found within the selection");
//        }
        int index = firstLine.toLowerCase().indexOf(searchWord.toLowerCase());
        int length = searchWord.length();
        System.out.println("your term is at index " + index + " and is " + length + " letters long.");
        String subString = firstLine.substring(0, index) + firstLine.substring(index+length);
        System.out.println(subString);
    }
}
