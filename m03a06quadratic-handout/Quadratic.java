// Write your code here
void main() {

    var s = new java.util.Scanner(System.in);
    s.useLocale(java.util.Locale.ENGLISH);

    var a = s.nextDouble();
    var b = s.nextDouble();
    var c = s.nextDouble();

    var d = ((b * b) - (4 * a * c));
    var x1 = (((-b) + Math.sqrt(d)) / (2 * a));
    var x2 = (((-b) - Math.sqrt(d)) / (2 * a));


    
    if (a == 0 && b == 0 && c == 0) {
        System.out.println("Infinitely many roots"); 
    
    } else if (a == 0 && b == 0) {
        System.out.println("No roots");
    
    } else if (a == 0) {
        System.out.println(-c / b);
    
    } else if (d > 0) {
        System.out.println(x1 + " " + x2);

    } else if (d == 0) {
        System.out.println(x1);
    
    } else {
        System.out.println("No roots");

    } 

    s.close();

}