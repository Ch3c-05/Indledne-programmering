class NullFinder {
    static boolean containsNull(int[] arr) {
        // Write your code here
        return arr == null;
    }

    static boolean containsNull(String[] arr) {
        // Write your code here
        if (arr == null) {
            return true;
        }
        for (String s : arr) {
            if (s == null) {
                return true;
            }
        }
        return false;
    }

    static boolean containsNull(int[][] arrArr) {
        // Write your code here
        if (arrArr == null) {
            return true;
        }
        for (int[] inner : arrArr) {
            if (containsNull(inner)) { 
                return true;
            }
        }
        return false;
    }

    static boolean containsNull(String[][] arrArr) {
        // Write your code here
        if (arrArr == null) {
            return true;
        }
        for (String[] inner : arrArr) {
            if (containsNull(inner)) { 
                return true;
            }
        }
        return false;
    }
}
