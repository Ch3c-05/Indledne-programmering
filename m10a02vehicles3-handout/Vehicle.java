// Write your code here
abstract class Vehicle {
    private String model;
    private String registrationPlate;

    public Vehicle(String model, String registrationPlate) {
        this.model = model;
        this.registrationPlate = registrationPlate;
    }

    public String getModel() {
        return this.model;
    }

    public String getRegistrationPlate() {
        return this.registrationPlate;
    } 

    public abstract double getCostPerKm();
}

class Minivan extends Vehicle {
    public int seats;

    public Minivan(String m, String r, int s) {
        super(m, r);
        this.seats = s;
    }

    @Override
    public double getCostPerKm() {
        return this.seats * 5; 
    }
}

class Truck extends Vehicle {
    public double maxLoad;

    public Truck(String m, String r, double max) {
        super(m, r);
        this.maxLoad = max;
    }

    @Override
    public double getCostPerKm() {
        return this.maxLoad * 0.175;
    }
}