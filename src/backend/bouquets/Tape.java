package backend.bouquets;

import backend.pack.Pack;
import backend.pack.PackType;
import backend.utils.Color;

public class Tape extends BouquetDecorator {
    private Pack pack;

    public Tape(IBouquet bouquet) {
        super(bouquet);
        this.pack = new Pack(PackType.TAPE, Color.blue, 1500);
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
        return super.toString() + " " + this.pack.toString();
    }
}
