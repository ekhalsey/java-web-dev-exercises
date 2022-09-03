package org.launchcode.java.RestarauntMenuStudio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> fullMenu = new ArrayList<>();
    LocalDate lastUpdated;

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = LocalDate.now();
    }

    public void displayLastUpdated() {
        setLastUpdated(lastUpdated);
        System.out.println("This menu was last updated on: " + this.lastUpdated);
    }

    public void addMenuItem(MenuItem menuItem) {
        if (!fullMenu.contains(menuItem)) {
            fullMenu.add(menuItem);
            //menuItem.setNewItem(true);
        }
    }

    public void removeMenuItem(MenuItem menuItem) {
        fullMenu.remove(menuItem);
    }
    //should take in string, which is what we search for in fullMenu to find what to remove.
    //MenuItem toBeRemoved = null;
    //for(MenuItem item: this.menuItems) {
    //
    // if (item.getName().equalsIgnoreCase(itemName.equalsIgnoreCase){
    //      toBeRemoved = item;
    //      }
    //      if (toBeRemoved != null {
    //      this.fullMenu.remove(menuItem);
    //      }
    //}

    public void displayMenu() {
        for (MenuItem food : fullMenu) {
            if (food.isNewItem() == true) {
                System.out.print("**NEW** ");
            }
            System.out.println(food.getName());

        }
        displayLastUpdated();
    }


}
