package org.example.Restaurant;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem(name:"Pizza", description:
        "Thick crust, mozzarella cheese-topped, marinara-sauced, classic American comfort food", price:9.95, category:
        "main course");
        MenuItem item2 = new MenuItem(name:"Spring Rolls", description:
        "Crunchy flaky exterior, filled with savory chicken and vegetables", price:5.99, category:"appetizer");
        MenuItem item3 = new MenuItem(name:"Strawberry Rhubarb Pie", description:
        "Fresh locally grown strawberries and rhubarb in a flaky crust, topped with a dollop of whipped cream", price:
        4.95, category:"dessert");
        MenuItem item4 = new MenuItem(name:"Cranberry Wild Rice Hot Dish", description:
        "A Minnesotan classic. Cranberries, wild rice, and roasted venison, seasoned and cooked to perfection.", price:
        14.00, category:"main course");
        MenuItem item5 = new MenuItem(name:"Chicken Wild Rice Soup", description:
        "Hearty chicken, wild rice, and vegetable soup.", price:15.99, category:"main course", isNew:"no");
        MenuItem item6 = new MenuItem(name:"Chips and Salsa", description:
        "Hand made tortilla chips, with unlimited fresh cilantro salsa", price:5.99, category:"appetizer");
        MenuItem item7 = new MenuItem(name:"Paint by Flavor", description:
        "Be creative, have fun! You'll be provided with a painting pallet of 6 different ice cream flavors, and a plate canvas to paint on. Eat your masterpiece immediately, or take time to admire your work before devouring it.", price:
        13.99, category:"dessert");


        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        menu.addItem(item6);
        menu.addItem(item7);

        //System.out.println(menu.getMenuItems().size());

        System.out.println(menu);

        //System.out.println(item1);

//       menu.removeItem(item1);
//       System.out.println(menu);

//       MenuItem item8 = new MenuItem(name: "Pear Cran Crisp", description: "Delicate slices of pear mixed with cranberries, topped with brown sugar, oats, and butter, baked to perfection.", price: 5.99, category: "dessert");
//       menu.addItem(item8);
//       System.out.println(menu);
    }

}
