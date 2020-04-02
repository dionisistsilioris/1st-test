package models;

public class SomeClass {

    private int x;
    private int y;

    public int getSum() {
        return x + y;
    }

    public double getQuotient() {
        return 1.0 * x / y;
    }

    public int getProduct() {
        return x * y;
    }

    public SomeClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
