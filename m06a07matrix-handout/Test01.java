// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var a = new double[][]{{1, 2}};
        var b = new double[][]{{3}, {4}};

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
