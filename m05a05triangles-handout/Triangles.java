// Write your code here
void main() {

    var s = new java.util.Scanner(System.in);
    s.useLocale(java.util.Locale.ENGLISH);
    

    var values = new Double[3] ;

    for (var i = 0; i < values.length; i++) {
        values[i] = s.nextDouble();
    }

    s.close();

    var a = values[0];
    var b = values[1];
    var c = values[2];

    var angleA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
    var angleB = Math.acos((a * a + c * c - b * b) / (2 * a * c));
    var angleC = Math.acos((a * a + b * b - c * c) / (2 * a * b));

    var tolerance = 1e-9;


    if (Double.isNaN(angleA) || Double.isNaN(angleB) || Double.isNaN(angleC)
            || angleA > Math.PI - tolerance
            || angleB > Math.PI - tolerance
            || angleC > Math.PI - tolerance) {
        IO.println("Degenerate");
    } else if (Math.abs(angleA - Math.PI / 2) < tolerance
            || Math.abs(angleB - Math.PI / 2) < tolerance
            || Math.abs(angleC - Math.PI / 2) < tolerance) {
        IO.println("Right");
    } else if (angleA > Math.PI / 2 
            || angleB > Math.PI / 2 
            || angleC > Math.PI / 2) {
        IO.println("Obtuse");
    } else {
        IO.println("Acute");
    }


}




