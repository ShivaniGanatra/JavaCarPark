 public class CarPark {
     private int amountOfCarSpots = 20;
     private int amountOfVanSpots = 6;
     private int amountOfMotorbikeSpots = 6;
     private int totalSpots;

     public int getTotalSpots() {
          totalSpots = amountOfCarSpots + amountOfVanSpots + amountOfMotorbikeSpots;
          return totalSpots;
     }

     public void setTotalSpots(int totalSpots) {
         this.totalSpots = totalSpots;
     }

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

     public String getCurrentCapacity() {
         return "This CarPark now has a capacity of " +
                 (amountOfVanSpots + amountOfMotorbikeSpots + amountOfCarSpots) + " with " +
                 amountOfCarSpots+ " car spots, " +
                 amountOfVanSpots+ " van spots, " +
                 amountOfMotorbikeSpots+ " motorbike spots, ";
     }

     @Override
     public String toString() {
         return "This CarPark has a capacity of " +
                 (amountOfVanSpots + amountOfMotorbikeSpots + amountOfCarSpots) + " with " +
                  amountOfCarSpots+ " car spots, " +
                 amountOfVanSpots+ " van spots, " +
                 amountOfMotorbikeSpots+ " motorbike spots, ";
     }
 }
