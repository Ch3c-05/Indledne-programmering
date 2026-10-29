// Write your code here
class Monster {
    private String name;
    private int health;

    public Monster(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getDescription() {
        return this.name + " (health: " + this.health + ")"; 
    }

    public int getHealth() {
        return this.health;
    }

    public boolean isDead() {
        if (this.health <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void heal(int points) {
        if (this.health + points > 100) {
            this.health = 100;
        } else {
            this.health = this.health + points;
        }
    }

    public void hit(int damage) {
        this.health = this.health - damage;
    }

    public void burn(int damage) {
        this.health = this.health - damage;
        
        if (this.health < 0) {
            this.health = 0;
        }
    }

}