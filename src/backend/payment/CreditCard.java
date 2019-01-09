package backend.payment;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    CreditCard(String number, String date, String cvv, int amount) {
        this.amount = amount;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public boolean canPay(int amount) {
        return this.amount > amount;
    }

    public boolean pay(int amount) {
        if (canPay(amount)) {
            this.amount -= amount;
            return true;
        }
        return false;
    }

}
