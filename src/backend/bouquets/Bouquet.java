package backend.bouquets;


import backend.flower.Plant;
import backend.pack.Pack;

import java.util.ArrayList;
import java.util.List;

public class Bouquet implements IBouquet {
    private List<Plant> plants;
    private int totalPrice = 0;

    public Bouquet() {
        this.plants = new ArrayList<>();
    }

    public Bouquet(List<Plant> plants) {
        this.plants = plants;
        calculateTotalPrice();
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
        calculateTotalPrice();
    }

    @Override
    public int getTotalPrice() {
        calculateTotalPrice();
        return totalPrice;
    }

    public String getFormattedPrice() {
        return String.valueOf(getTotalPrice()/100.0);
    }

    private void calculateTotalPrice() {
        for (Plant plant : plants) {
            totalPrice += plant.getPrice();
        }
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "plants=" + plants +
                ", totalPrice=" + getFormattedPrice() +
                '}';
    }
}
