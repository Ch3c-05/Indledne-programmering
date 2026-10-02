// Write your code here
void main(){

    var s = new java.util.Scanner(System.in);
    s.useLocale(java.util.Locale.ENGLISH);
    var n = s.nextDouble();


    if (n >= 1000) {

       var d1 = (n * (20.0/100.0));
       var dn = n - d1;
       System.out.println("The discounted price is " + dn + " (discount: 20%)");
    
    } else if (n >= 500) {

        var d2 = (n * (10.0/100.0));
        var dn2 = n - d2;
        System.out.println("The discounted price is " + dn2 + " (discount: 10%)");

    } else if (n >= 250) {

        var d3 = (n * (5.0/100.0));
        var dn3 = n - d3;
        System.out.println("The discounted price is " + dn3 + " (discount: 5%)");

    } else {
        System.out.println("The discounted price is " + n + " (discount: 0%)");
    }


    s.close();
}