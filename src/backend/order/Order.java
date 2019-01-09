package backend.order;

import backend.delivery.IDelivery;
import backend.payment.IPayStrategy;

import java.util.List;

public class Order {
    private List<IOrder> order;
    private Customer customer;
    private Recipient recipient;
    private IDelivery delivery;
    private IPayStrategy payment;

    public Order(List<IOrder> order, Customer customer, Recipient recipient, IDelivery delivery, IPayStrategy payment) {
        this.order = order;
        this.customer = customer;
        this.recipient = recipient;
        this.delivery = delivery;
        this.payment = payment;
    }

    public Order(List<IOrder> order, Customer customer, Recipient recipient, IDelivery delivery) {

        this.order = order;
        this.customer = customer;
        this.recipient = recipient;
        this.delivery = delivery;
    }

    public List<IOrder> getOrder() {
        return order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public IDelivery getDelivery() {
        return delivery;
    }

    public IPayStrategy getPayment() {
        return payment;
    }
}
