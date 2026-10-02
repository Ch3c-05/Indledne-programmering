// Write your code here
void main () {

    var s  = new java.util.Scanner(System.in);
    
    var n = Integer.parseInt(s.nextLine());
    var car = s.nextLine();
    var len = car.length();

    if (n != 0) {

        for (var i = 0; i < len; i++) {
    
            var char0 = car.charAt(i);
            var s1 = Character.toString(char0);
            var rep = s1.repeat(n);

            System.out.print(rep);

        }

    } else {

        System.out.println("");

    }

    s.close();

}