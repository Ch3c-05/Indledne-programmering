// Write your code here
class Character {

    String name;
    int speed;
    int strength;

    Character(String name, int speed, int strength) {
        this.name = name;
        this.speed = speed;
        this.strength = strength;
    }

    String description() {
        return this.name + " (" + "speed = " + this.speed + "," + " strength = " + this.strength + ")"; 
    }

    void powerUp(int amount) {
        this.speed = this.speed + amount;
        this.strength = this.strength + amount;
    }

    void nerf(int amount) {
        this.speed = this.speed - amount;
        this.strength = this.strength - amount;
    }

    boolean isBetterThan(Character other) {
        if (this.speed > other.speed && this.strength > other.strength) {
            return true;
        } else {
            return false;
        }
    }

    static void printBest(Character[] characters) {
        if (characters.length == 0) {
            System.out.println("The array is empty!");
            return;
        }

        for (var i = 0; i < characters.length; i++) {
            boolean isBest = true;


            for (var j = 0; j < characters.length; j++) {
                if (!characters[i].isBetterThan(characters[j]) && j != i) {
                    isBest = false;
                } 
            }

            if (isBest == true) {
                System.out.println("Best character: " + characters[i].description());
                return;
            } 


        }
        System.out.println("There is no best character in the array!");

    }




} 