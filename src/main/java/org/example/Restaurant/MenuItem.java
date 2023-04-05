package org.example.Restaurant;

import java.util.Date;

public class MenuItem {

        private String name;
        private String description;
        private double price;
        private String category;
        private Date dateAdded;
        private boolean isNew;


    public MenuItem(String name, String description, double price, String category, Date dateAdded, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
        this.isNew = isNew;
    }

}
