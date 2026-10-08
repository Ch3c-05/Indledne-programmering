class ArrayUtils {
    // Write your code here

    static int[] rotateLeft(int[] arr) {
        return rotateLeft(arr, 1);
    }

    static int[] rotateLeft(int[] arr, int n) {
        var result = new int[arr.length];

        if (arr.length == 0) {
            return result;
        }

        var shift = n % arr.length;

        for (var i = 0; i < arr.length; i++) {
            result[i] = arr[(i + shift) % arr.length];
        }

        return result;
    }

}
