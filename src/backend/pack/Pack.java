package backend.pack;

import backend.bouquets.IBouquets;
import backend.utils.Color;

public class Pack implements IBouquets {
    private PackType packType;
    private Color color;
    private int price;

    public Pack(PackType packType, Color color, int price) {
        this.packType = packType;
        this.color = color;
        this.price = price;
    }

    public PackType getPackType() {
        return packType;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pack{" +
                "packType=" + packType +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
