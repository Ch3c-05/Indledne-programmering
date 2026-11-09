// Write your code here
// Write your code here
class Vehicle {
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
}

class Minivan extends Vehicle {
    public int seats;

    public Minivan(String m, String r, int s) {
        super(m, r);
        this.seats = s;
    }
}

class Truck extends Vehicle {
    public double maxLoad;

    public Truck(String m, String r, double max) {
        super(m, r);
        this.maxLoad = max;
    }
}