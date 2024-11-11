 public class CarPark {
     private int amountOfCarSpots = 20;
     private int amountOfVanSpots = 6;
     private int amountOfMotorbikeSpots = 6;

     public int getAmountOfMotorbikeSpots() {
         return amountOfMotorbikeSpots;
     }

     public void setAmountOfMotorbikeSpots(int amountOfMotorbikeSpots) {
         this.amountOfMotorbikeSpots = amountOfMotorbikeSpots;
     }

     public int getAmountOfVanSpots() {
         return amountOfVanSpots;
     }

     public void setAmountOfVanSpots(int amountOfVanSpots) {
         this.amountOfVanSpots = amountOfVanSpots;
     }

     public int getAmountOfCarSpots() {
         return amountOfCarSpots;
     }

     public void setAmountOfCarSpots(int amountOfCarSpots) {
         this.amountOfCarSpots = amountOfCarSpots;
     }

     public int getAmountOfSpots(){
         return this.amountOfCarSpots + this.amountOfMotorbikeSpots + this.amountOfVanSpots;
     }

     @Override
     public String toString() {
         return "This CarPark has " +
                 (amountOfVanSpots + amountOfMotorbikeSpots + amountOfCarSpots) + " spots in total " +
                  amountOfCarSpots+ " car spots, " +
                 amountOfVanSpots+ " van spots, " +
                 amountOfMotorbikeSpots+ " motorbike spots, ";
     }
 }
