import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarPark carpark = new CarPark();

        System.out.print("Hello. ");
        System.out.println(carpark);

        System.out.println(carpark.getTotalSpots());

        do {
            System.out.println("Would you like to tell me what type of vehicle you'd like to park?" +
                    "i.e a motorbike, car or van");
            String input = scanner.next();
            if(Objects.equals(input, "van") | Objects.equals(input, "Van")) {
                System.out.println("you have entered a van ");
                carpark.setAmountOfVanSpots(0);
                System.out.println(carpark.getCurrentCapacity());
            } else if (Objects.equals(input, "car") | Objects.equals(input, "Can")) {
                System.out.println("you have entered a van ");
                carpark.setAmountOfCarSpots(0);
                System.out.println(carpark.getCurrentCapacity());

            } else if (Objects.equals(input, "motorbike") | Objects.equals(input, "Motorbike")) {
                System.out.println("you have entered a motorbike ");
                carpark.setAmountOfMotorbikeSpots(0);
                System.out.println(carpark.getCurrentCapacity());
            } else System.out.println("You haven't entered an appropriate vehicle");
        } while(carpark.getTotalSpots()>0);
        System.out.println("The car park is now full");


    }
}
