package org.launchcode.java.RestarauntMenuStudio;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem = false;

    private String name;

    public MenuItem(double price, String description, String category, String name) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }
    public void displayNew() {
        if (newItem == true) {
            System.out.println("This item is NEW: " + this.name);
        }
    }

}
