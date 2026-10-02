class Utils {
    static int max(int x, int y, int z) {
        // Write your code here

        if (x >= y && x >= z){

            return x;

        } else if (y >= x && y >= z) {

            return y;

        } else {

            return z;

        }    

    }
}
