void main() {
    var values = Util.parseInput();

    var min = values[0];
    var max = values[0];
    var drops = 0;

    for (var i = 1; i < values.length; i++) {

        if (values[i] < min) {
            min = values[i];
        }

        if (values[i] > max) {
            max = values[i];
        }

        if (values[i] < values[i - 1]) {
            drops++;
        }

    }

    System.out.println("Minimum water temperature: " + min);
    System.out.println("Maximum water temperature: " + max);
    System.out.println("Number of temperature drops: " + drops);
}

class Util {
    /**
     * Reads a line from the console and splits it into double values.
     *
     * @return an array of doubles read from the console
    */
    static double[] parseInput() {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var input = scanner.nextLine();

        scanner.close();

        var split = input.split("; ");
        var values = new double[split.length];

        for (int i = 0; i < values.length; i++) {

            values[i] = Double.parseDouble(split[i]);

        }
        return values;
    }
}