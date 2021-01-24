package org.launchcode.java.studios.restaurant;

public class Restaurant {
    public static void main(String[] Args) {
        MenuItem pizza = new MenuItem("Pizza", "It's pizza...", "Main", 9);
        MenuItem pie = new MenuItem("Pie", "It's pie...", "Dessert", 5);
        MenuItem cereal = new MenuItem("Cap'n Crunch", "Destroys the roof of your mouth but tastes so damn good!", "Breakfast", 4);
        MenuItem toasterStrudel = new MenuItem("Toaster Strudels (2)", "Choose your filling: Just kidding green apple is all I have.", "Breakfast", 5);
        MenuItem toasterStrudels = new MenuItem("Toaster Strudels (2)", "Choose your filling: Just kidding green apple is all I have.", "Breakfast", 5);

        Menu menu1 = new Menu();
        menu1.addItem(pizza);
        menu1.addItem(pie);
        menu1.addItem(cereal);
        menu1.addItem(toasterStrudel);
        menu1.addItem(toasterStrudels);

        System.out.println(menu1.getItemList().size());

        System.out.println(menu1.getLastUpdated());

        menu1.printAllItems();

        menu1.removeItem(pizza);
        System.out.println(menu1.getItemList().size());

        menu1.printItem(pie);

    }
}
