// Write your code here
class VendingMachine {
    private String location;
    private int coffee;
    private int choco;
    private int credits;
    
    public VendingMachine(String location, int servCoffee, int servChoco) {
        this.location = location;
        this.coffee = servCoffee;
        this.choco = servChoco;
        this.credits = 0;
    }

    public String description() {
        return "Machine @ " + 
        this.location + " (coffee: " + 
        this.coffee + "; " + "chocolate: " + 
        this.choco + "; " + "credits: " + 
        this.credits + ")";
    }

    public void putCredits(int amount) {
        this.credits = this.credits + amount;
    }

    public boolean serveCoffee() {
        if (this.credits >= 10 && this.coffee >= 1) {
            this.credits = this.credits - 10;
            this.coffee = this.coffee - 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean serveChocolate() {
        if (this.credits >= 20 && this.choco >= 1) {
            this.credits = this.credits - 20;
            this.choco = this.choco - 1;

            return true;
        } else {
            return false;
        }
    }

    public boolean serveWienerMelange() {
        if (this.credits >= 30 && this.choco >= 1 && this.coffee >= 1) {
            this.credits = this.credits - 30;
            this.choco = this.choco - 1;
            this.coffee = this.coffee - 1;
            
            return true;
        } else {
            return false;
        }
    }

    public int retrieveCredits() {
        int totalCredits = this.credits;
        this.credits = 0;

        return totalCredits;
    }
}

class AdvancedVendingMachine extends VendingMachine {

    public AdvancedVendingMachine(String location, int coffees, int chocolates) {
        super(location, coffees, chocolates);
    }

    public int serveCoffees(int n) {
        int served = 0;
        for (var i = 0; i < n; i++) {
            if (serveCoffee()) {
                served++;
            }
        }
        return served;
    }

    public int serveChocolates(int n) {
        int served = 0;
        for (var i = 0; i < n; i++) {
            if (serveChocolate()) {
                served++;
            }
        }
        return served;
    }

    public int serveWienerMelanges(int n) {
        int served = 0;
        for (var i = 0; i < n; i++) {
            if (serveWienerMelange()) {
                served++;
            }
        }
        return served;
    }
}