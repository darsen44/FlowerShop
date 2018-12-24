package backend.delivery;

import java.util.Date;

public class Delivery {
    private String address;
    private double price;
    private DeliveryType dType;
    private Date date;

    public Delivery(String address, DeliveryType dType, Date date) {
        this.address = address;
        this.dType = dType;
        this.price = dType.getPrice();
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public DeliveryType getdType() {
        return dType;
    }

    public Date getDate() {
        return date;
    }
}
