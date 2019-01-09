package backend;

import backend.bouquets.Bouquet;
import backend.flower.Plant;
import backend.flower.category.Bush;
import backend.flower.category.Category;
import backend.flower.category.Flower;
import backend.flower.category.Tree;
import backend.pack.Pack;
import backend.pack.PackType;
import backend.utils.Color;
import backend.utils.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoreFiller {

    private Random random = new Random(System.currentTimeMillis());

    private Flower[] flowers;
    private Bush[] bushes;
    private Tree[] trees;
    private Country[] countries;
    private Color[] colors;
    private PackType[] packTypes;

    public StoreFiller() {
        flowers = Flower.values();
        bushes = Bush.values();
        trees = Tree.values();
        countries = Country.values();
        colors = Color.values();
        packTypes = PackType.values();
    }

    public Store createStore(int plantCount, int packCount, int bouqetCount) {
        List<Plant> plants = createPlants(flowers, plantCount/2);
        plants.addAll(createPlants(bushes, plantCount/3));
        plants.addAll(createPlants(trees, plantCount/3));
        List<Pack> packs = new ArrayList<>();
        for (int i = 0; i < packCount; i++) {
            packs.add(createPack());
        }
        List<Bouquet> bouquets = new ArrayList<>();
        for (int i = 0; i < bouqetCount; i++) {
            bouquets.add(createBouqet());
        }

        return new Store(plants, packs, bouquets);
    }

    public List<Plant> createPlants(Category[] categories, int plantCount){
        List<Plant> plants = new ArrayList<>();
        for (int i = 0; i < plantCount; i++) {
            plants.add(createPlant(categories));
        }
        return plants;
    }


    public Plant createPlant(Category[] categories) {
        Category category = categories[random.nextInt(categories.length)];
        return createPlant(category);
    }

    public Plant createPlant(Category category) {
        Country country = countries[random.nextInt(countries.length)];
        Color color = colors[random.nextInt(colors.length)];
        int length = 1 + random.nextInt(100);
        int price = 1 + random.nextInt(8000);
        return new Plant(category, color, country, length, price);
    }

    public Pack createPack() {
        PackType packType = packTypes[random.nextInt(packTypes.length)];
        Color color = colors[random.nextInt(colors.length)];
        int price = 1 + random.nextInt(9500);
        return new Pack(packType, color, price);
    }

    public Bouquet createBouqet() {
        List<Plant> plants = createPlants(flowers, random.nextInt(50));
        List<Pack> packs = new ArrayList<>();
        packs.add(createPack());
        return new Bouquet(plants);
    }

    public List<Plant> createFlowers(int plantCount) {
        return  createPlants(flowers, plantCount);
    }
}
