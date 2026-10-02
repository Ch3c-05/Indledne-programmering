void main() {
   
    var s = new java.util.Scanner(System.in);
    
    System.out.println(Utils.greet(s));
    System.out.println("Please write two numbers");

    
    var n1 = s.nextInt();
    var n2 = s.nextInt();

    var sum1 = Utils.sum(n1);
    var sum2 = Utils.sum(n2);
 

    System.out.println(sum1);

    System.out.println(sum2);

    s.close();

}


class Utils {
    static int sum(int n) {
        var result = 0;
        for (var i = 0; i <= n; i++) {
            result = result + i;

        }
        return result;
    }

    static String greet(java.util.Scanner s) {
        System.out.println("What's your name?");
        var name = s.nextLine();
        return "Hello, " + name;
    }
}