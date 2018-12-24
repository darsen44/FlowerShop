package backend.presents;

public class Toys implements IPresents {
    private String title;
    private String type; // soft, game, etc
    private double price;

    public Toys(String title, String type, double price) {
        this.title = title;
        this.type = type;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
