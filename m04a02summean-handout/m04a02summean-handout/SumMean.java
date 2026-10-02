// Write your code here
void main () {

    var s = new java.util.Scanner(System.in);
    s.useLocale(java.util.Locale.ENGLISH);

    var n = s.nextInt();
    var sum = 0.0;
    var mean = 0.0;


    if (n != 0) {

        for (var i = 1; i <= n; i++) {

            var m = s.nextDouble();
            sum = sum + m;
            mean = sum / n;

        }
        System.out.println("The sum of the " + n + " given values is: " + sum);
        System.out.println("The mean of the " + n + " given values is: " + mean);
    
    } else {
        System.out.println("The sum of the " + n + " given values is: " + sum);

    }

    s.close();
}