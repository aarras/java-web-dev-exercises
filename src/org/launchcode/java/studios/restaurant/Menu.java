package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> itemList;

    public Menu(Date lastUpdated, ArrayList<MenuItem> itemList) {
        this.lastUpdated = lastUpdated;
        this.itemList = itemList;
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

}
