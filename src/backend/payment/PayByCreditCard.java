package backend.payment;

public class PayByCreditCard implements IPayStrategy {
    private CreditCard creditCard;

    @Override
    public boolean pay(int paymentAmount) {
        if (creditCard != null) {
           return this.creditCard.pay(paymentAmount);
        }
        return false;
    }

    @Override
    public void fillPaymentDetails() {
        this.creditCard = new CreditCard("1234 1234 1234 1234", "12/34", "11", 250000);
    }
}
