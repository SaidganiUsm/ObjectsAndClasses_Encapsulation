public class Dimensions {
    private int width;
    private int height;
    private int length;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int cargoVolume() {
        int volume = height * width * length;
        return volume;
    }

    public void print() {
        System.out.println(width + " - " + height + " - " + length);
    }

    public String toString() {
        return "Its volume is " + cargoVolume();
    }
}
