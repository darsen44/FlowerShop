package backend.bouquets.phrase;

public enum PhraseMaterial {
    WOOD(10),METAL(14),PLASTIC(7);
    private double price; // price for 1 letter
    PhraseMaterial(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
