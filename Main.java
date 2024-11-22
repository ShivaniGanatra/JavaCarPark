import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarPark carpark = new CarPark();

        Motorbike annasMotorbike = new Motorbike("lime","anna",2012,"mclaren");


        System.out.print("Hello. ");
        System.out.println(carpark);

        Car shivsCar = new Car("pink","shiv",2020,"audi");
        List<Vehicle> VehiclesList = new ArrayList<>();
        VehiclesList.add(shivsCar);
        VehiclesList.add(annasMotorbike);

        do {
            System.out.println("Would you like to tell me what type of vehicle you'd like to park?" +
                    "i.e a motorbike, car or van");
            String input = scanner.next();
            if(Objects.equals(input, "van") || Objects.equals(input, "Van")
                    || Objects.equals(input, "VAN") || Objects.equals(input, "V")) {
                System.out.println("you have entered a van ");
                carpark.setAmountOfVanSpots(1);
                System.out.println(carpark.getCurrentCapacity());
                System.out.println("----");

            } else if (Objects.equals(input, "car") | Objects.equals(input, "Can")
                    || Objects.equals(input, "CAR") || Objects.equals(input, "C")) {
                System.out.println("you have entered a car ");

                if (carpark.getAmountOfCarSpots() > 0) {
                    carpark.setAmountOfCarSpots(1);
                    if (carpark.getAmountOfCarSpots()==0) {
                        System.out.println("All the car spots are now full");
                    }
                }

                System.out.println(carpark.getCurrentCapacity());
                System.out.println("----");

            } else if (Objects.equals(input, "motorbike") | Objects.equals(input, "Motorbike")
                    || Objects.equals(input, "MOTORBIKE") || Objects.equals(input, "M")) {
                System.out.println("You have entered a motorbike ");
                if (carpark.getAmountOfMotorbikeSpots()>0) {
                    carpark.setAmountOfMotorbikeSpots(1);
                    if (carpark.getAmountOfMotorbikeSpots()==0) {
                        System.out.println("All the motorbike spots are now full");
                    }
                } else if(carpark.getAmountOfCarSpots()>0) {
                    System.out.println("The motorbike spots are full but you can park your motorbike in a car spot");
                    carpark.setAmountOfCarSpots(1);
                    if (carpark.getAmountOfCarSpots()==0) {
                        System.out.println("All the car spots are now full");
                    }
                } else {
                    System.out.println("The motorbike and car spots are full but you can park your motorbike in a van spot");
                    carpark.setAmountOfVanSpots(1);
                    if (carpark.getAmountOfCarSpots()==0) {
                        System.out.println("All the car,van and motorbike spots are now full");
                    }
                }

                System.out.println(carpark.getCurrentCapacity());
                System.out.println("----");
            } else System.out.println("You haven't entered an appropriate vehicle");

        } while(carpark.getTotalSpots()>0);
        System.out.println("The car park is now full");

    }
}
