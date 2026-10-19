class BarfBagsCollection {
    public static void main(String args[]) {
        // Write your code here
        var scanner = new java.util.Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine().trim());
        var bags = new BarfBag[n];

        for (var i = 0; i < n; i++) {
            var parts = scanner.nextLine().split("; ");

            var id = Integer.parseInt(parts[0].trim());
            var airline = parts[1];
            var year = Integer.parseInt(parts[2].trim());
            var value = Double.parseDouble(parts[3].trim());

            bags[i] = new BarfBag(id, airline, year, value);

        }

        for (var i = 0; i < n; i++) {
            System.out.println(bags[i].description());
        }

    }
}

class BarfBag {
    // Write your code here

    int id;
    String airline;
    int year;
    double value;

    BarfBag(int id, String airline, int year, double value) {
        this.id = id;
        this.airline = airline;
        this.year = year;
        this.value = value;
    }

    String description() {
        return "Bag " + id + ": " + airline + " (" + year + "). Value: " + value + " DKK";
    }


}
