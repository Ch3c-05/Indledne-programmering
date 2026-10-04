// Write your code here
void main () {

    var values = Util.parseInput();

    var sum = 0.0;
    var mean = 0.0;
    var sqsum = 0.0;

    for (var i = 0; i < values.length; i++) {

        sum = sum + values[i];

    }
    mean = sum / values.length;

    for (var i = 0; i < values.length; i++) {

        sqsum = sqsum + Math.pow(values[i] - mean, 2);

    }
    var deviation = Math.sqrt(sqsum / values.length);

    System.out.println("Mean: " + mean);
    System.out.println("Standard deviation: " + deviation);

}

class Util {
    /**
     * Reads a line from the console and splits it into integer values.
     *
     * @return an array of integers read from the console
    */
    static double[] parseInput() {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var input = scanner.nextLine();

        scanner.close();

        var split = input.split("; ");
        var values = new double[split.length]; 

        for (var i = 0; i < values.length; i++) {

            values[i] = Double.parseDouble(split[i]);

        }
        return values;
    }
}
