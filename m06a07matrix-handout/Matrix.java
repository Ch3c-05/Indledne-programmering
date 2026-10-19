// Write your code here
class Matrix {
    static double[][] transpose(double[][] matrix) {

        var result = new double[matrix[0].length][matrix.length];

        for (var i = 0; i < result.length; i++) {

            for (var j = 0; j < result[i].length; j++) {

                result[i][j] = matrix[j][i];

            }
        }
        return result;

    }
}