// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var m1 = new VendingMachine("DTU building 324", 1, 1);
        var m2 = new VendingMachine("Lyngby Station", 1, 0);
        var m3 = new VendingMachine("CPH Airport Gate A10", 22, 13);
        var machines = new VendingMachine[] {m1, m2, m3};

        TestUtils.serveChocolate(machines);

        System.out.println("Putting some credits in all machines...");
        m1.putCredits(0);
        m2.putCredits(15);
        m3.putCredits(20);
        System.out.println(""); // Empty line for spacing

        TestUtils.serveChocolate(machines);

        TestUtils.retrieveCredits(machines);

        TestUtils.serveChocolate(machines);
    }
}
