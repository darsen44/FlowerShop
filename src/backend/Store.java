package backend;

import backend.bouquets.Bouqet;
import backend.flower.Plant;
import backend.flower.category.Category;
import backend.order.Order;
import backend.pack.Pack;
import backend.utils.Country;

import java.util.List;

public class Store {

    private static final Country NATIVE = Country.MEXICO;
    private List<Plant> plants;
    private List<Pack> packs;
    private List<Bouqet> bouquets;
    private List<Order> orders;

    public Store(List<Plant> plants, List<Pack> packs, List<Bouqet> bouquets) {
        this.plants = plants;
        this.packs = packs;
        this.bouquets = bouquets;
    }

    public void getAllProducts() {
        System.out.println("Plants");
        for (Plant plant: plants) {
            System.out.println(plant);
        }
        System.out.println("Packs");
        for (Pack pack : packs) {
            System.out.println(pack);
        }
        System.out.println("Bouquets");
        for (Bouqet bouqet : bouquets) {
            System.out.println(bouqet);
        }
    }

    public void getPlants(boolean isNative) {
        if(isNative) {
            for (Plant plant: plants) {
                if(plant.getCountry().equals(NATIVE)) {
                    System.out.println(plant);
                }
            }
        } else {
            for (Plant plant: plants) {
                if(!plant.getCountry().equals(NATIVE)) {
                    System.out.println(plant);
                }
            }
        }
    }

    public void getPlantsByType(String type) {
        for (Plant plant: plants) {
            if(plant.getType().compareToIgnoreCase(type) == 0) {
                System.out.println(plant);
            }
        }
    }

    public void getPlantsByCategory(String category) {
        for (Plant plant: plants) {
            if(plant.getCategory().equals(category)) {
                System.out.println(plant);
            }
        }
    }

    public void buyGoods() {

    }


}
