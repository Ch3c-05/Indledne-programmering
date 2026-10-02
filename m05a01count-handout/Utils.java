class Utils {
    static int count(int v, int[] values) {
        // Write your code here

        var occur = 0;

        for (var i = 0; i < values.length; i++) {
            
            
            if (values[i] == v) {
                
                occur++;

            }

        }
        return occur;

    }
}
