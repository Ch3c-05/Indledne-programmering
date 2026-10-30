// Write your code here
interface Monster {
    public String getDescription();
    public int getHealth();
    public boolean isDead();
    public void heal(int points);
    public void hit(int damage);
    public void burn(int damage);
}

class Wumpus implements Monster{
    private String name;
    private int health;

    public Wumpus(String name) {
        this.name = name;
        this.health = 20;
    }

    public String getDescription() {
        return this.name + " (wumpus; health: " + this.health + ")"; 
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
        if (this.health + points > 20) {
            this.health = 20;
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

class Owlbear implements Monster{
    private String name;
    private int health;

    public Owlbear(String name) {
        this.name = name;
        this.health = 59;
    }

    public String getDescription() {
        return this.name + " (owlbear; health: " + this.health + ")"; 
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
        if (this.health + points > 59) {
            this.health = 59;
        } else {
            this.health = this.health + points;
        }
    }

    public void hit(int damage) {
        this.health = this.health - (damage/2);
    }

    public void burn(int damage) {
        this.health = this.health - damage;
        
        if (this.health < 0) {
            this.health = 0;
        }
    }
}

class Demogorgon implements Monster{
    private String name;
    private int health;

    public Demogorgon(String name) {
        this.name = name;
        this.health = 200;
    }

    public String getDescription() {
        return this.name + " (demogorgon; health: " + this.health + ")"; 
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
        if (this.health + points > 200) {
            this.health = 200;
        } else {
            this.health = this.health + points;
        }
    }

    public void hit(int damage) {
        this.health = this.health - damage;
    }

    public void burn(int damage) {
        this.health = this.health - (damage/2);
        
        if (this.health < 0) {
            this.health = 0;
        }
    }
}

