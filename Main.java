import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    static int motorbikeNumber;
    static int vanNumber;
    static int carNumber;

    static int carInCarSpots;
    static int carInVanSpots;

    static int vanInVanSpots;
    static int vanInCarSpots;

    static int motorbikeInMotorbikeSpots;
    static int motorbikeInCarSpots;
    static int motorbikeInVanSpots;

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
                    "i.e a motorbike(M), car(C) or van(V)");
            System.out.println("or know how many spots vans (VS), cars (CS) or motorbikes (MS) are already taking up");

            String input = scanner.next();
            if(Objects.equals(input, "van") || Objects.equals(input, "Van")
                    || Objects.equals(input, "VAN") || Objects.equals(input, "V")) {
                System.out.println("you have entered a van ");
                if (carpark.getAmountOfVanSpots() > 0) {
                    carpark.setAmountOfVanSpots(1);
                    vanNumber+=1;
                    vanInVanSpots+=1;
                } else if (carpark.getAmountOfCarSpots() >=3) {
                    System.out.println("There are no van spots but you can park in 3 car spots");
                    carpark.setAmountOfCarSpots(3);
                    vanNumber+=1;
                    vanInCarSpots+=1;
                } else {
                    System.out.println("There are no spaces to park the van");
                }
                System.out.println(carpark.getCurrentCapacity());
                System.out.println("----");

            } else if (Objects.equals(input, "car") | Objects.equals(input, "Can")
                    || Objects.equals(input, "CAR") || Objects.equals(input, "C")) {
                System.out.println("you have entered a car ");

                if (carpark.getAmountOfCarSpots() > 0) {
                    carpark.setAmountOfCarSpots(1);
                    carNumber +=1;
                    carInCarSpots+=1;
                    if (carpark.getAmountOfCarSpots()==0) {
                        System.out.println("All the car spots are now full");
                    }
                } else if (carpark.getAmountOfVanSpots() >0) {
                    carpark.setAmountOfVanSpots(1);
                    carNumber +=1;
                    carInVanSpots+=1;

                } else if(carpark.getAmountOfVanSpots()==0){
                    System.out.println("You cant park any more cars there arent any car or van spots left");
                }

                System.out.println(carpark.getCurrentCapacity());
                System.out.println("----");

            } else if (Objects.equals(input, "motorbike") | Objects.equals(input, "Motorbike")
                    || Objects.equals(input, "MOTORBIKE") || Objects.equals(input, "M")) {
                System.out.println("You have entered a motorbike ");
                if (carpark.getAmountOfMotorbikeSpots()>0) {
                    carpark.setAmountOfMotorbikeSpots(1);
                    motorbikeNumber += 1;
                    motorbikeInMotorbikeSpots+=1;
                    if (carpark.getAmountOfMotorbikeSpots()==0) {
                        System.out.println("All the motorbike spots are now full");
                    }
                } else if(carpark.getAmountOfCarSpots()>0) {
                    System.out.println("The motorbike spots are full but you can park in a car spot");
                    carpark.setAmountOfCarSpots(1);
                    motorbikeNumber += 1;
                    motorbikeInCarSpots+=1;
                    if (carpark.getAmountOfCarSpots()==0) {
                        System.out.println("All the car spots are now full");
                    }
                } else {
                    System.out.println("The motorbike and car spots are full");
                    carpark.setAmountOfVanSpots(1);
                    motorbikeNumber += 1;
                    motorbikeInVanSpots+=1;
                    if (carpark.getAmountOfVanSpots()==0) {
                        System.out.println("All the car,van and motorbike spots are now full");
                    }
                }

                System.out.println(carpark.getCurrentCapacity());
                System.out.println("----");
            } else if (Objects.equals(input,"MS")) {
                System.out.println("Motorbikes take up " + motorbikeInMotorbikeSpots + " motorbike spots, " +
                        motorbikeInCarSpots + " car spots, " + motorbikeInVanSpots + " van spots so " +
                        (motorbikeInVanSpots+motorbikeInCarSpots+motorbikeInMotorbikeSpots) + " spots in total");

            } else if (Objects.equals(input,"VS")) {
                System.out.println("There are  " + vanNumber + " vans that take up  "
                        + (vanInVanSpots + 3 * vanInCarSpots) + " spots. "
                        + vanInVanSpots + " vans in "+vanInVanSpots+ " VAN spots "
                        + vanInCarSpots + " vans in " + 3 * vanInCarSpots +" CAR spots");

            } else if (Objects.equals(input,"CS")) {
                System.out.println("Cars take up  " + carInCarSpots + " car spots, " +
                        carInVanSpots + " van spots so " + (carInCarSpots + carInVanSpots) + " in total");
            }else System.out.println("You haven't entered an appropriate vehicle");

        } while(carpark.getTotalSpots()>0);
        System.out.println("The car park is now full");
        System.out.println("in the car park there are " + motorbikeNumber + " motorbikes " +
                vanNumber+ " vans " + carNumber + " cars" );

    }
}
