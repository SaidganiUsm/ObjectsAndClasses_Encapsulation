import java.text.Format;
import java.util.FormatFlagsConversionMismatchException;

public class Elevator {
    private int currentFloor = 1;
    private int maxFloor = 10;
    private int minFloor = -1;

    public Elevator(int minFloor, int maxFloor) {
        this.currentFloor = currentFloor;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void getCurrentFloor() {
        currentFloor = currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor < maxFloor ?
                currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = minFloor > currentFloor ?
                currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        if (minFloor > floor) {
            System.out.println("We do not have floors lower than " + minFloor);
        } else if (maxFloor < floor) {
            System.out.println("We do not have floors higher than " + maxFloor);
        } else if (currentFloor == floor) {
        } else{
            currentFloor = floor;
            System.out.println("Now you r on " + currentFloor + " floor");
        }
    }
}
