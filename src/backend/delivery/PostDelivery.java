package backend.delivery;

public class PostDelivery implements IDelivery {
    private String address;
    private int cost;

    public PostDelivery(String address) {
        this.address = address;
    }

    @Override
    public void deliver() {
        System.out.println("Post delivery to " + address);
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
