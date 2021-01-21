package org.launchcode.java.studios.restaurant;

public class MenuItem {

    private String name;
    private String description;
    private String category;
    private float price;
    private boolean isNew;

    public MenuItem(String name, String description, String category, float price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
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

    MenuItem pizza = new MenuItem("Pizza", "It's pizza...", "Main", 9);

}
