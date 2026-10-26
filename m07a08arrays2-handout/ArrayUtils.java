class ArrayUtils {
    // Write your code here
    static boolean areEqual(int[] arr1, int[] arr2) {
        if (arr1 == arr2) {          
            return true;
        }
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean areEqual(int[][] arrArr1, int[][] arrArr2) {
        if (arrArr1 == arrArr2) {    
            return true;
        }
        if (arrArr1 == null || arrArr2 == null) {
            return false;
        }
        if (arrArr1.length != arrArr2.length) {
            return false;
        }
        for (int i = 0; i < arrArr1.length; i++) {
            if (!areEqual(arrArr1[i], arrArr2[i])) {
                return false;
            }
        }
        return true;
    }

    static int[] deepCopy(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    static int[][] deepCopy(int[][] arrArr) {
        if (arrArr == null) {
            return null;
        }
        int[][] copy = new int[arrArr.length][];
        for (int i = 0; i < arrArr.length; i++) {
            copy[i] = deepCopy(arrArr[i]);
        }
        return copy;
    }

}