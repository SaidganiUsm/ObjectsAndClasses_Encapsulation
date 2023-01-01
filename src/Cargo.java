public class Cargo {
    private final int size;
    private final double weight;
    private final String shippingAddres;
    private final boolean isRotate;
    private final String number;
    private final boolean isBrittle;

    public Cargo(int size, double weight, String shippingAddres,
                 boolean isRotate, String number, boolean isbrittle) {
        this.size = size;
        this.weight = weight;
        this.shippingAddres = shippingAddres;
        this.isRotate = isRotate;
        this.number = number;
        this.isBrittle = isbrittle;
    }

    public int getSize() {
        return size;
    }

    public Cargo setSize(int size) {
        return new Cargo(size, weight,shippingAddres,
        isRotate, number, isBrittle);
    }

    public double getWeight() {
        return weight;
    }

    public Cargo setWeight(double weight) {
        return new Cargo(size, weight,shippingAddres,
                isRotate, number, isBrittle);
    }

    public String getShippingAddres() {
        return shippingAddres;
    }

    public Cargo setShippingAddres(String shippingAddres) {
        return new Cargo(size, weight,shippingAddres,
                isRotate, number, isBrittle);
    }

    public boolean isRotate() {
        return isRotate;
    }

    public Cargo setRotate(boolean rotate) {
        return new Cargo(size, weight,shippingAddres,
                isRotate, number, isBrittle);
    }

    public String getNumber() {
        return number;
    }

    public Cargo setNumber(String number) {
        return new Cargo(size, weight,shippingAddres,
                isRotate, number, isBrittle);
    }

    public boolean isBrittle() {
        return isBrittle();
    }

    public Cargo setIsBrittle(boolean isBrittle) {
        return new Cargo(size, weight,shippingAddres,
                isRotate, number, isBrittle);
    }

    public String toString() {
        return size + " - " + weight + " kg - " + shippingAddres + " - "
                + isRotate + " - " + number + " + " + isBrittle;
    }
}
