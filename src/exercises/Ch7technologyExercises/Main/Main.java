package exercises.Ch7technologyExercises.Main;

public class Main {
    public static void main(String args[]) {
       Computer testComp = new Computer("apple", "macbook air", 16,256);
       Laptop testLaptop = new Laptop("apple", "macbook pro", 8, 500, 2, 11.4, false);
       SmartPhone testPhone = new SmartPhone("apple", "iPhone 8", 16,128,24, 7);
        System.out.println(testComp.getId());
        System.out.println(testLaptop.getId());
        System.out.println(testPhone.getId());
    }
}
