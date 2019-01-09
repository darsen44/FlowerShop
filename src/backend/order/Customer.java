package backend.order;

import backend.payment.IPayStrategy;

public class Customer {
    private String firstName;
    private String lastName;
    private int numberOfPhone;
    private IPayStrategy payment;

    public Customer(String firstName, String lastName, int numberOfPhone, IPayStrategy payment) {
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

    public IPayStrategy getPayment() {
        return payment;
    }
}
