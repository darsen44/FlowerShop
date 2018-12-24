package backend.bouquets.pack;

import backend.bouquets.IBouquets;

public class Pack implements IBouquets {
    private PackType packType;// wrapper or box
    private String material;
    private double price;

    public Pack(PackType packType, String material, double price) {
        this.packType = packType;
        this.material = material;
        this.price = price;
    }

    public PackType getPackType() {
        return packType;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }
}
