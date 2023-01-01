import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dimensions volume = new Dimensions(20,10,20);
        volume.print();
        System.out.println(volume);
        Cargo good = new Cargo( 20,20,"Russia",
                true, "an345", false);
        System.out.println(good);

        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Enter the floor you need: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}
