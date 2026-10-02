// Write your code here
void main(){
    var s = new java.util.Scanner(System.in);
    var a = s.nextDouble();
    var b = s.nextDouble();
    var x = s.nextDouble();
    var y = s.nextDouble();

    s.close();

    var calc = Math.abs((a * x) - y + b) / Math.sqrt(1 + (a * a));

    System.out.println("The distance is " + calc);
      

}