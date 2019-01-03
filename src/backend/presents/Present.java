package backend.presents;

import backend.order.IOrder;

public class Present implements IOrder {
    private String title;
    private double price;

    public Present(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Present{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
