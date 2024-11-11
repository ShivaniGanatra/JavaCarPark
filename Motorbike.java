public class Motorbike extends Vehicle{


    public Motorbike(String colour, String owner, int yearOfIssue, String model) {
        super(colour, owner, yearOfIssue, model);
    }

    @Override
    public void getInformation() {
        System.out.println("This is a Motorbike");
    }
}
