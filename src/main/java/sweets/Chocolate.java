package sweets;

public class Chocolate extends Sweets {
    private String color;
    public Chocolate(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chocolate + [" + super.toString() + ", color = " + color + "]";
    }
}
