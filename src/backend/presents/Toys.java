package backend.presents;

public class Toys extends Present {
    private String type; // soft, game, etc

    public Toys(String title, String type, double price) {
        super(title, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
