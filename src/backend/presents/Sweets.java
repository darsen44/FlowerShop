package backend.presents;

public class Sweets implements IPresents {
    private String title;
    private double price;

    public Sweets(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
