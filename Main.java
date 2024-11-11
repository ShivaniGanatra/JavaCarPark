import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarPark carpark = new CarPark();
        System.out.println(carpark.getAmountOfMotorbikeSpots());
        System.out.println(carpark.getAmountOfSpots());
        System.out.println(carpark);


        System.out.print("Hello. ");
        System.out.println(carpark);

        do {
            System.out.println("Would you like to tell me what type of vehicle you'd like to park?" +
                    "i.e a motorbike, car or van");
            String input = scanner.next();
            if(Objects.equals(input, "van") | Objects.equals(input, "Van")) {
                System.out.println("you have entered a van ");
                carpark.setAmountOfCarSpots(3);
            } else if (Objects.equals(input, "car") | Objects.equals(input, "Can")) {
                System.out.println("you have entered a van ");
            } else if (Objects.equals(input, "motorbike") | Objects.equals(input, "Motorbike")) {
                System.out.println("you have entered a van ");
            } else System.out.println("You haven't entered an appropriate vehicle");
        } while(carpark.getAmountOfSpots()>18);


    }
}
