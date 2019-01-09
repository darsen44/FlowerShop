package backend.bouquets;

public class BouquetDecorator implements IBouquet{

    private IBouquet bouquet;

    public BouquetDecorator(IBouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public int getTotalPrice() {
        return this.bouquet.getTotalPrice();
    }

    @Override
    public String toString() {
        return this.bouquet.toString();
    }
}
