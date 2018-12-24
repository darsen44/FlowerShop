package backend.order;

import backend.delivery.Delivery;
import backend.payment.PaymentData;

import java.util.List;

public class Order {
    private List<IOrder> order;
    private Customer customer;
    private Recipient recipient;
    private Delivery delivery;
    private PaymentData payment;

    public Order(List<IOrder> order, Customer customer, Recipient recipient, Delivery delivery, PaymentData payment) {
        this.order = order;
        this.customer = customer;
        this.recipient = recipient;
        this.delivery = delivery;
        this.payment = payment;
    }

    public Order(List<IOrder> order, Customer customer, Recipient recipient, Delivery delivery) {

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

    public Delivery getDelivery() {
        return delivery;
    }

    public PaymentData getPayment() {
        return payment;
    }
}
