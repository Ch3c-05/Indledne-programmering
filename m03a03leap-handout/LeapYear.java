// Write your code here
void main() {

    var s = new java.util.Scanner(System.in);

    var n = s.nextInt();
    var r1 = n % 4;
    var r2 = n % 100;
    var r3 = n % 400;


    if (r1 == 0){

        if(r2 == 0){

            if(r3 == 0){
                System.out.println("The year " + n + " is a leap year");
            } else {
                System.out.println("The year " + n + " is not a leap year");
            }

        } else{
            System.out.println("The year " + n + " is a leap year");
        }

    } else {
        System.out.println("The year " + n + " is not a leap year");
    }
}