package org.launchcode.java.RestarauntMenuStudio;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> fullMenu = new ArrayList<>();
    Date lastUpdated;

    public static void main(String[] args) {
        MenuItem tacos = new MenuItem(12.00, "three whole tacos", "Entree", "Tacos");
        Menu myMenu = new Menu();
        myMenu.addMenuItem(tacos);
        myMenu.displayMenu();
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void displayLastUpdated() {
        System.out.println("This menu was last updated on: " + this.lastUpdated);
    }

    public void addMenuItem(MenuItem menuItem) {
        if (!fullMenu.contains(menuItem)) {
            fullMenu.add(menuItem);
            menuItem.setNewItem(true);
        }
    }

    public void displayMenu() {
        for (MenuItem food : fullMenu) {
            System.out.println(food.getName());
        }
    }


}
