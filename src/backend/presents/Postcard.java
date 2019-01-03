package backend.presents;

import backend.order.IOrder;

public class Postcard extends Present {
    private String type;
    private String text;

    public Postcard(String title, String type, double price, String text) {
        super(title, price);
        this.type = type;
        this.text = text;
    }

    public void setText(String text, boolean reset) { // add text to exist or reset text
        if (reset) this.text = text;
        else this.text += text;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }

}
