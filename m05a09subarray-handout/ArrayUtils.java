class ArrayUtils {
    static boolean contains(int[] arr1, int[] arr2) {
        // Write your code here
        var j = 0;

        for (var i = 0; i < arr1.length && j < arr2.length; i++) {

            if(arr1[i] == arr2[j]) {
                j++;
            }

        }
        return j == arr2.length;


    }
}
