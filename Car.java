public class Car extends Vehicle {

    public Car(String colour, String owner, int yearOfIssue, String model) {
        super(colour, owner, yearOfIssue, model);
    }

    @Override
    public String toString() {
        return "Car : " + this.getOwner() + "'s " + this.getColour() + ", " +
                this.getYearOfIssue() + ", " + this.getModel();

    }

    public void getInformation() {
        System.out.println("This is a car");
    }
}
