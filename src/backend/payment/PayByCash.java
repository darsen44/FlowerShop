package backend.payment;

public class PayByCash implements IPayStrategy {
    private int money;

    @Override
    public boolean pay(int paymentAmount) {
        return paymentAmount < money;
    }

    @Override
    public void fillPaymentDetails() {
        this.money = 100000;
    }
}
