package org.example.Restaurant;

import java.util.Date;

public class MenuItem {

        private String name;
        private String description;
        private double price;
        private String category;
        private Date dateAdded;



    public MenuItem(String name, String description, double price, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }


   @Override
    public String toString() {
        String newText = isNew()? " -New!-": "";
        return name + newText + '\n' +
       description + " ||$ " + price + " ||";
    }
//@Override
//public boolean equals(Object toBeCompared) {
//    if (this ==)
//}

boolean isNew() {
        //subtract item's dateAdded from today's date and return true if it's less than 30 days
        return true;
}
}
