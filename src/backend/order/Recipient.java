package backend.order;

public class Recipient {
    private String firstName;
    private String lastName;
    private int numberOfPhone;

    public Recipient(String firstName, String lastName, int numberOfPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfPhone = numberOfPhone;
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
}
