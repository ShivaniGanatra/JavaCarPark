public class Van extends Vehicle{


    public Van(String colour, String owner, int yearOfIssue, String model) {
        super(colour, owner, yearOfIssue, model);
    }

    @Override
    public void getInformation() {
        System.out.println("This is a van");
    }

    @Override
    public String toString() {
        return "Van : " + this.getOwner() + "'s " + this.getColour() + ", " +
                this.getYearOfIssue() + ", " + this.getModel();

    }
}
