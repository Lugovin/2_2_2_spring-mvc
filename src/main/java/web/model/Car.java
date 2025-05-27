package web.model;

public class Car {

    private int id;
    private String make;
    private String model;
    private int year;

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return make + " " + model + ", " + year + "год.";
    }
}
