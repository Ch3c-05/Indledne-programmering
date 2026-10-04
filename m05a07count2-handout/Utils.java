class Utils {
    // Write your code here
    static int count(String s, String[] strings) {

        var occur = 0;
        var target = s.toUpperCase();

        for (var i = 0; i < strings.length; i++) {

            if (strings[i].toUpperCase().equals(target)) {
                occur++;
            }

        }
        return occur;


    }

}
