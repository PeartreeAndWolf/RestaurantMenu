package org.example.Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;



    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n" + item.toString());
            }
        }

        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n" + item.toString());
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n" + item.toString());
            }
        }


        return "\n~THE NORTH SHORE CAFE~\n" +
        "\nAPPETIZERS\n" + appetizers.toString() + "\n" +
        "\nMAIN COURSES\n" + mainCourses.toString() + "\n" +
        "\nDESSERTS\n" + desserts.toString() + "\n";
//        "+ \nMenu last updated: " +lastUpdated.toString();

    }


    void addItem(MenuItem item) {
        menuItems.add(item);
        lastUpdated = new Date();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

}