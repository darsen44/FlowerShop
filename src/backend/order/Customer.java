package backend.order;

import backend.payment.PaymentData;

public class Customer {
    private String firstName;
    private String lastName;
    private int numberOfPhone;
    private PaymentData payment;

    public Customer(String firstName, String lastName, int numberOfPhone, PaymentData payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfPhone = numberOfPhone;
        this.payment = payment;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfPhone() {
        return numberOfPhone;
    }

    public PaymentData getPayment() {
        return payment;
    }
}
