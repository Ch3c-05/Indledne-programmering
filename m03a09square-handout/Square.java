// Write your code here
void main() {

    var s = new java.util.Scanner(System.in);
    
    var i = 0;
    var n = s.nextInt();
    var p = "#".repeat(n);

    while (i < n) {
    
        System.out.println(p);
        i++;
        
    }

    s.close();
}