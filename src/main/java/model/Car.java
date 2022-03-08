package model;

public class Car {
    private String brand;
    private String model;
    private int yearOfIssue;
    private int power;
    private String bodyType;

    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "model.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", power=" + power +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
}
