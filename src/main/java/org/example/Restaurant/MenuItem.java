package org.example.Restaurant;


public class MenuItem {

    private String name;
    private String description;
    private double price;
    private String category;
//    private Date dateAdded;
    private boolean isNew;


    public MenuItem(String name, String description, double price, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }


    public String getCategory() {
        return category;
    }


    public boolean isNew() {
        return isNew;
    }

    public void setName(String newName) {
        this.name = newName;
    }



    @Override
    public String toString() {
        String newText = isNew() ? " ~New!~" : "";
        return name + newText + '\n' +
                description + " ||$ " + price + " ||\n";
    }
}

