// Write your code here
void main() {

    var s = new java.util.Scanner(System.in); 

    var n = s.nextInt();
    var m = s.nextInt();
    var prd = 0;

    for (var i = 0; i <= m; i++ ) {
        
        prd = n * i;
        System.out.println(n + " * " + i + " = " + prd);

    }
}