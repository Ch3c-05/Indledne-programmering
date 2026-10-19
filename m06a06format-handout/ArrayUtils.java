// Write your code here
class ArrayUtils {

    static String format(int[] arr) {

        var string = "";

        for (var i = 0; i < arr.length; i++) {

            if (i != 0) {

                string = string + " ";

            }
            string = string + arr[i];

        }
        return string;

    }

    static String format(int[][] arr) {

        var string = "";

        for (var i = 0; i < arr.length; i++) {

            if (i != 0) {

                string = string + System.lineSeparator();

            }
            string = string + format(arr[i]);

        }
        return string;

    }

}