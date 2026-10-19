class ArrayUtils {
    // Write your code here

    static boolean areEqual(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {

            return false;
        }

        for (var i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {
                return false;
            }

        }
        return true;

    }

    static boolean areEqual(int[][] arrArr1, int[][] arrArr2) {

        if (arrArr1.length != arrArr2.length) {

            return false;
        }

        for (var i = 0; i < arrArr1.length; i++) {

            if (!areEqual(arrArr1[i], arrArr2[i])) {

                return false;    
            }

        }
        return true;   

    }

}
