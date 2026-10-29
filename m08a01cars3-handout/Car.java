// Write your code here
class Car {

    private String brand;
    private String model;
    private String numberPlate;
    private String color;

    public Car(String brand, String model, String numberPlate, String color) {
        this.brand = brand;
        this.model = model;
        this.numberPlate = numberPlate;
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getNumberPlate() {
        return this.numberPlate;
    }

    public String getColor() {
        return this.color;
    }

    public String description() {   
        var str = this.brand + " " + this.model + ", " + this.color + " [" + this.numberPlate + "]";
        return str;
    }

    public boolean equals(Car other) {

        if (this.brand.equals(other.brand) && this.model.equals(other.model) && this.numberPlate.equals(other.numberPlate) && this.color.equals(other.color)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isAlike(Car other) {
        if (this.brand.equals(other.brand) && this.model.equals(other.model) && this.color.equals(other.color)) {
            return true;
        } else {
            return false;
        }
    }

}