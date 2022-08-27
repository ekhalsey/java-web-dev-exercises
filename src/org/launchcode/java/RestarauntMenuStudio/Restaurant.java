package org.launchcode.java.RestarauntMenuStudio;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem tacos = new MenuItem(12.00, "three whole tacos", "Entree", "Tacos", true);
        MenuItem corndog = new MenuItem(4.00, "its a corn-dog", "Entree", "Corndog", false);
        Menu myMenu = new Menu();

        myMenu.addMenuItem(tacos);
        myMenu.addMenuItem(corndog);

        myMenu.displayMenu();
//        myMenu.removeMenuItem(tacos);
//        myMenu.removeMenuItem(corndog);
//        System.out.println("removed:");
//        myMenu.displayMenu();
    }
}
