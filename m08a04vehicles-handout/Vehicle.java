// Write your code here
interface Vehicle {
    public String getModel();
    public String getRegistrationPlate();
}

class Minivan implements Vehicle {
    private String model;
    private String registrationPlate;
    public int seats;

    public Minivan(String m, String r, int s) {
        this.model = m;
        this.registrationPlate = r;
        this.seats = s;
    }

    public String getModel() {
        return this.model;
    }

    public String getRegistrationPlate() {
        return this.registrationPlate;
    }
}

class Truck implements Vehicle {
    private String modelTruck;
    private String registrationPlate1;
    public double maxLoad;

    public Truck(String m, String r, double max) {
        this.modelTruck = m;
        this.registrationPlate1 = r;
        this.maxLoad = max;
    }

    public String getModel() {
        return this.modelTruck;
    }

    public String getRegistrationPlate() {
        return this.registrationPlate1;
    }
}

