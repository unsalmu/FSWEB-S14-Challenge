package org.example.models;

public class Hamburger {
   private String name;
   private String meat;
   private double price;
   private String breadRollType;


   private String addition1Name;
   private double addition1Price;
   private String addition2Name;
   private double addition2Price;
   private String addition3Name;
   private double addition3Price;
   private String addition4Name;
   private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String name, String meat, double price, String breadRollType,
                     String addition1Name, double addition1Price, String addition2Name, double addition2Price,
                     String addition3Name, double addition3Price, String addition4Name, double addition4Price) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }
    public void addToPrice(double amount){
        this.price += amount;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
         this.addition1Name = name;
         this.addition1Price = price;
         this.price += price;

    }

    public void addHamburgerAddition2(String name, double price) {
         this.addition2Name = name;
         this.addition2Price = price;
         this.price += price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        this.price += price;

    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        this.price += price;

    }

    public double itemizeHamburger() {
        System.out.println("Hamburger: " + name + " Meat: " + meat + " Price: " + price +
                " Bread: " + breadRollType);
        double totalPrice = getPrice();
        if(addition1Name != null){
            System.out.println("Addition1 : " + addition1Name + "Price : " + addition1Price);
            totalPrice =+ addition1Price;
        }
        if(addition2Name != null){
            System.out.println("Addition2 : " + addition2Name + "Price : " + addition2Price);
            totalPrice =+ addition2Price;
        }
        if(addition3Name != null){
            System.out.println("Addition3 : " + addition3Name + "Price : " + addition3Price);
            totalPrice =+ addition3Price;
        }
        if(addition4Name != null){
            System.out.println("Addition4 : " + addition4Name + "Price : " + addition4Price);
            totalPrice =+ addition4Price;
        }
        else {
            System.out.println("Total price: " + totalPrice);
        }
        return totalPrice;
    }


}
