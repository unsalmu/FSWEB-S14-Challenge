package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        addToPrice(price);
        System.out.println("Added " + name + " for " + price);

    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        addToPrice(price);
        System.out.println("Added " + name + " for " + price);
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if(healthyExtra1Name != null) {
            System.out.println("extra1: " + healthyExtra1Name + "extra price: " + healthyExtra1Price);
            totalPrice =+ healthyExtra1Price;
        }
        if(healthyExtra2Name != null) {
            System.out.println("extra2: " + healthyExtra2Name + "extra price " + healthyExtra2Price );
            totalPrice =+ healthyExtra2Price;
        }
        System.out.println("Total price: " + totalPrice);
        return totalPrice;

    }
}
