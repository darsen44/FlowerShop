package backend.delivery;

public enum DeliveryType {
    POST(5),COURIER(10),FETCH(0);
    private double price;

    DeliveryType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}