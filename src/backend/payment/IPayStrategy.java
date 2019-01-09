package backend.payment;

public interface IPayStrategy {
    boolean pay(int paymentAmount);
    void fillPaymentDetails();
}
