package backend.flower;

import backend.flower.category.Category;
import backend.order.IOrder;
import backend.utils.Color;
import backend.utils.Country;

public class Plant implements IOrder {
    private Category category;
    private Color color;
    private Country country;
    private int length;
    private int price;

    public Plant(Category category, Color color, Country country, int length, int price) {
        this.category = category;
        this.color = color;
        this.country = country;
        this.length = length;
        this.price = price;
    }

    public String getType() {
        return category.getClass().getSimpleName();
    }

    public String getCategory() {
        return category.toString();
    }

    public Color getColor() {
        return color;
    }

    public Country getCountry() {
        return country;
    }

    public int getLength() {
        return length;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type=" + category.getClass().getSimpleName() +
                ", category=" + category +
                ", color=" + color +
                ", country='" + country + '\'' +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}
