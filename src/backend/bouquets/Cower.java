package backend.bouquets;

import backend.pack.Pack;
import backend.pack.PackType;
import backend.utils.Color;

public class Cower extends BouquetDecorator {
    private Pack pack;

    public Cower(IBouquet bouquet) {
        super(bouquet);
        this.pack = new Pack(PackType.PAPER_COWER, Color.green, 20000);
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + this.pack.getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + " "  + this.pack.toString();
    }
}
