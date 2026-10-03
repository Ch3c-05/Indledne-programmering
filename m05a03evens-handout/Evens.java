void main() {
    var values = Util.parseInput();
    // Write your code here

    var even = 0;

    for (var i = 0; i < values.length; i++) {

        var remainder = values[i] % 2;

        if (remainder == 0) {

            even++;

        } 

    }
    System.out.println(even);
    


}

class Util {
    /**
     * Reads a line from the console and splits it into integer values.
     *
     * @return an array of integers read from the console
    */
    static int[] parseInput() {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var input = scanner.nextLine();

        scanner.close();

        var split = input.split(", ");
        var values = new int[split.length]; 

        for (int i = 0; i < values.length; i++) {

            values[i] = Integer.parseInt(split[i]);

        }
        return values;
    }
}
