package org.launchcode.java.RestarauntMenuStudio;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNewItem;
    private String name;


    public MenuItem(double price, String description, String category, String name, Boolean isNewItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.name = name;
        this.isNewItem = isNewItem;
    }

    public String getName() {
        return name;
    }

    public boolean isNewItem() {
        return isNewItem;
    }

    public void setNewItem(boolean newItem) {
        this.isNewItem = newItem;
    }
//    public void displayNew() {
//        if (isNewItem == true) {
//            System.out.println("This item is NEW: " + this.name);
//        }
    //}

    public String toString() {
        return this.name + ": " + this.description + ", Price: " + this.price;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
