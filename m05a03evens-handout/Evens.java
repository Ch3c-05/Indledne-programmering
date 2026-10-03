void main() {
    var values = Util.parseInput();
    // Write your code here

    


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
