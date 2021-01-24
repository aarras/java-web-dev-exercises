package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> itemList;

    public Menu() {
        this.lastUpdated = Date();
        this.itemList = new ArrayList<>();
    }

    //getters and setters
    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(Date aLastUpdated) {
        this.lastUpdated = aLastUpdated;
    }

    public ArrayList<MenuItem> getItemList() {
        return this.itemList;
    }

    public void setItemList(ArrayList<MenuItem> aItemList) {
        this.itemList = aItemList;
    }

    //Adds a new MenuItem to menu if it is not already on the menu
    protected void addItem(MenuItem menuItem) {
        if(!itemList.contains(menuItem)) {
            itemList.add(menuItem);
        } else System.out.println("Item already on menu");
    }

    //Removes specified MenuItem from menu if it exists on menu
    protected void removeItem(MenuItem menuItem) {
        if(itemList.contains(menuItem)) {
            itemList.remove(menuItem);
        } else System.out.println("Item not on menu");
    }

    //Print specified MenuItem on menu if it exists on menu
    public void printItem(MenuItem menuItem) {
        if (itemList.contains(menuItem)) {
            System.out.println("\nName: " + menuItem.name + "\nDescription: " + menuItem.description + "\nCategory: " + menuItem.category + "\nPrice: " + menuItem.price);
        } else System.out.println("Item not on menu");
    }

    //Prints all MenuItems on a menu
    public void printAllItems() {
        for (MenuItem i : itemList) {
            printItem(i);
        }
    }

    //Grabs the current date
    private static Date Date() {
        return new Date();
    }

}
