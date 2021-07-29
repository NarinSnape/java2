package sweets;

public class Jellybean extends Sweets {
    private int size;
    public Jellybean(String name, double weight, double price, int size) {
        super(name, weight, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Jellybean + [" + super.toString() + ", size = " + size + "]";
    }
}
