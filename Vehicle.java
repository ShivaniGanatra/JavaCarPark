public abstract class Vehicle {
    private String colour;
    private String owner;
    private int yearOfIssue;
    private String model;

    public Vehicle(String colour, String owner, int yearOfIssue, String model) {
        this.colour = colour;
        this.owner = owner;
        this.yearOfIssue = yearOfIssue;
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public abstract void getInformation();
}
