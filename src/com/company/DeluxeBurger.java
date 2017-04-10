package com.company;

/**
 * Created by flatironschool 4/10/17.
 */
public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Double Patty and Bacon", 8, "White");
        super.addCustomAddition1("Chips", 2.50);
        super.addCustomAddition2("Drink", 1.69);
    }

    @Override
    public void addLettuce() {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addCheese() {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addBacon() {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addSecretSauce() {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
