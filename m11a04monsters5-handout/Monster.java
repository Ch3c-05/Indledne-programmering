// Write your code here
class Monster {
    private String species;
    private String name;
    private int maxHealth;
    private int health;
    private double hitDamageFactor;
    private double burnDamageFactor;

    public Monster(String species, String name, int maxHealth,
                   double hitDamageFactor, double burnDamageFactor) {
        this.species = species;
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.hitDamageFactor = hitDamageFactor;
        this.burnDamageFactor = burnDamageFactor;
    }

    public String getDescription() {
        return this.name + " (" + this.species + "; health: " + this.health + ")";
    }

    public int getHealth() {
        return this.health;
    }

    public boolean isDead() {
        return this.health <= 0;
    }

    public void heal(int points) {
        if (this.health + points > this.maxHealth) {
            this.health = this.maxHealth;
        } else {
            this.health = this.health + points;
        }
    }

    public void hit(int damage) {
        this.health = this.health - (int) (damage * this.hitDamageFactor);

        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void burn(int damage) {
        this.health = this.health - (int) (damage * this.burnDamageFactor);

        if (this.health < 0) {
            this.health = 0;
        }
    }

    public char getSymbol() {
        return Character.toUpperCase(this.species.charAt(0));
    }
}

class Wumpus extends Monster {
    public Wumpus(String name) {
        super("wumpus", name, 20, 1.0, 1.0);
    }
}

class Owlbear extends Monster {
    public Owlbear(String name) {
        super("owlbear", name, 59, 0.5, 1.0);
    }
}

class Demogorgon extends Monster {
    public Demogorgon(String name) {
        super("demogorgon", name, 200, 1.0, 0.5);
    }
}

class Thing extends Monster {
    public Thing(String name) {
        super("thing", name, 30, 1.0, 2.0);
    }
}