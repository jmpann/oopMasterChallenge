package com.company;

// The purpose of the application is to help a ficticious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in
// Bills store.
// The basic hamburger should have the following items.
// bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger. Each one of these items gets charged an additional
// price so you need some way to track how many items got added and to calculate the price (for the base
// burger and all the additions).
// This burger has a base price and the additions are all seperately priced.
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price.


/**
 * Created by flatironschool on 4/10/17.
 */
public class Hamburger {
    private String name;
    private String meatAddition;
    private double price;
    private String breadRollType;

    private boolean lettuce;
    private double lettucePrice = .25;

    private boolean cheese;
    private double cheesePrice = 1;

    private boolean bacon;
    private double baconPrice = 1.5;

    private boolean secretSauce;
    private double secretSaucePrice = .5;

    private String customAddition1Name;
    private double customAddition1Price;

    private String customAddition2Name;
    private double customAddition2Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meatAddition = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addLettuce() {
        this.lettuce = true;
        this.price += this.lettucePrice;
    }

    public void addCheese() {
        this.cheese = true;
        this.price += this.cheesePrice;
    }

    public void addBacon() {
        this.bacon = true;
        this.price += this.baconPrice;
    }

    public void addSecretSauce() {
        this.secretSauce = true;
        this.price += this.secretSaucePrice;
    }

    public void addCustomAddition1(String name, double price) {
        this.customAddition1Name = name;
        this.customAddition1Price = price;
    }

    public void addCustomAddition2(String name, double price) {
        this.customAddition2Name = name;
        this.customAddition2Price = price;
    }

    public double getPrice() {
        System.out.println(this.name + " hamburger" + " on a " + this.breadRollType + " roll "
                + "with " + this.meatAddition + ", price is " + this.price);
        return this.price;
    }
}

