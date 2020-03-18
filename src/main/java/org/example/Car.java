package org.example;

public class Car {

    private String make;
    private int yearModel;
    private double engineSize;

    public Car(String make, int yearModel, double engineSize) {
        this.make = make;
        this.yearModel = yearModel;
        this.engineSize = engineSize;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", yearModel=" + yearModel +
                ", engineSize=" + engineSize +
                '}';
    }
}
