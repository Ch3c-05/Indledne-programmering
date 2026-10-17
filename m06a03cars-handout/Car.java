// Write your code here
class Car {

    String brand;
    String model;
    String numberPlate;
    String color;

    static String description(Car car) {
        
        var str = car.brand + " " + car.model + ", " + car.color + " [" + car.numberPlate + "]";
        return str;
    }

    static boolean equals(Car car, Car other) {

        if (car.brand.equals(other.brand) && car.model.equals(other.model) && car.numberPlate.equals(other.numberPlate) && car.color.equals(other.color)) {

            return true;

        } else {

            return false;

        }

    }

    static boolean isAlike(Car car, Car other) {

        if (car.brand.equals(other.brand) && car.model.equals(other.model) && car.color.equals(other.color)) {

            return true;

        } else {

            return false;

        }

    }

}