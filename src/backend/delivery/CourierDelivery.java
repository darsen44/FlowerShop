package backend.delivery;

public class CourierDelivery implements IDelivery {
    private String address;
    private int cost;

    public CourierDelivery(String address) {
        this.address = address;
    }

    @Override
    public void deliver() {
        System.out.println("Courier Delivery to " + address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
