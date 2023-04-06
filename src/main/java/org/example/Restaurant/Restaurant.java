package org.example.Restaurant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("*Pizza*", "Thick crust, mozzarella cheese-topped, marinara-sauced, classic American comfort food", 19.99, "main course", false);
        MenuItem item2 = new MenuItem("*Spring Rolls*",
        "Crunchy flaky exterior, filled with savory chicken and vegetables", 5.99, "appetizer", false);
        MenuItem item3 = new MenuItem("*Strawberry Rhubarb Pie*",
        "Fresh locally grown strawberries and rhubarb in a flaky crust, topped with a dollop of whipped cream",
        4.95, "dessert", false);
        MenuItem item4 = new MenuItem("*Cranberry Wild Rice Hot Dish*",
        "A Minnesotan classic. Cranberries, wild rice, and roasted venison, seasoned and cooked to perfection",
        14.99, "main course", true);
        MenuItem item5 = new MenuItem("*Chicken Wild Rice Soup*",
        "Hearty chicken, wild rice, and vegetable soup", 15.99, "main course", false);
        MenuItem item6 = new MenuItem("*Chips and Salsa*",
        "Hand made tortilla chips, with unlimited fresh cilantro salsa", 5.99, "appetizer", true);
        MenuItem item7 = new MenuItem("*Paint by Flavor*",
        "Be creative, have fun! You'll be provided with a painting pallet of 6 different ice cream flavors, and a plate canvas to paint on. Eat your masterpiece immediately, or take time to admire your work before devouring it",
        13.99, "dessert", true);


        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        menu.addItem(item6);
        menu.addItem(item7);

        Date lastUpdated = menu.getLastUpdated();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = format.format(lastUpdated);



        //System.out.println(item1);

//       menu.removeItem(item1);
//       System.out.println(menu);

       MenuItem item8 = new MenuItem("*Pear Cran Crisp*", "Delicate slices of pear joined with cranberries, topped with brown sugar, oats, and butter, and baked to perfection", 5.99, "dessert", true);
       menu.addItem(item8);

       MenuItem item9 = new MenuItem("*Grilled Watermelon Slices*", "Ripe, juicy watermellon slices,sprinkled with herbs, and grilled over an open flame", 5.99, "appetizer", true);
       menu.addItem(item9);

       MenuItem item10 = new MenuItem("*Lutefisk*", "The one and only Lutefisk! Cod--dried, salted, cured in vats of lye, then soaked in ice water. Whether you love it, hate it, or are only eating it on a dare, everyone in the restaurant will join you in the olfactory experience that is Lutefisk", 21.99, "main course", false);
       menu.addItem(item10);

       System.out.println(menu);
        System.out.println("Menu last updated: " + formattedDate);
    }

}
