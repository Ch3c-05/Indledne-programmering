// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var a = new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        var b = new double[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};

        System.out.println("Matrix 'a':");
        MatrixUtils.print(a);
        System.out.println("");
        System.out.println("Transposing matrix 'a'...");
        var at = Matrix.transpose(a);
        System.out.println("Result of the transposition:");
        MatrixUtils.print(at);

        System.out.println("");
        System.out.println("Matrix 'b':");
        MatrixUtils.print(b);
        System.out.println("");
        System.out.println("Transposing matrix 'b'...");
        var bt = Matrix.transpose(b);
        System.out.println("Result of the transposition:");
        MatrixUtils.print(bt);
    }
}
