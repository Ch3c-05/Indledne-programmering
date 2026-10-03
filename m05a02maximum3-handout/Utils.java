class Utils {
    // Write your code here

    static double max(double[] values) {

        var max = values[0];

        for (var i = 0; i < values.length; i++) {

            if (values[i] > max) {

                max = values[i];

            }

        }

        return max;


    }


}
