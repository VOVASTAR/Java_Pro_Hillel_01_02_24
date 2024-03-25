package homework.hw9;

import java.time.LocalDate;

public class Product implements Cloneable {

    private String type;
    private double price;
    private boolean isDiscount;
    private LocalDate date;
    private int id;

    public Product(String type, double price, boolean isDiscount, LocalDate date, int id) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.date = date;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", isDiscount=" + isDiscount +
                ", date=" + date +
                '}' + "\n";
    }

    @Override
    public Product clone() {
        try {
            Product clone = (Product) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
