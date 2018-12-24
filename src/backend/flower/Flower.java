package backend.flower;

import backend.bouquets.IBouquets;

public class Flower implements IBouquets {
    private String sort; //maybe use enam?
    private String country;
    private String color;
    private double price; // by 1 piece
    private Category category; // maybe just use String?

    public Flower(String sort, String country, String color, double price, Category category) {
        this.sort = sort;
        this.country = country;
        this.color = color;
        this.price = price;
        this.category = category;
    }

    public String getSort() {
        return sort;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
