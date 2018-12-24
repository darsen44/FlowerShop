package backend.presents;

public class Postcard implements IPresents {
    private String title;
    private String type;
    private double price;
    private String text;

    public Postcard(String title, String type, double price, String text) {
        this.title = title;
        this.type = type;
        this.price = price;
        this.text = text;
    }

    public Postcard(String title, String type, double price) {
        this.title = title;
        this.type = type;
        this.price = price;
    }

    public void setText(String text, boolean reset) { // add text to exist or reset text
        if (reset) this.text = text;
        else this.text += text;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getText() {
        return text;
    }

}
