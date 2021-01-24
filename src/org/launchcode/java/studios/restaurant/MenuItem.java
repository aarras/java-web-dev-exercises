package org.launchcode.java.studios.restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {

    protected String name;
    protected String description;
    protected String category;
    protected float price;
    protected boolean isNew;

    public MenuItem(String name, String description, String category, float price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Float.compare(menuItem.price, price) == 0 && name.equals(menuItem.name) && category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, price);
    }

    //getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float aPrice) {
        this.price = aPrice;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public void setIsNew(boolean aIsNew) {
        this.isNew = aIsNew;
    }

    public boolean checkIfNew() {
        return this.isNew;
    }

}
