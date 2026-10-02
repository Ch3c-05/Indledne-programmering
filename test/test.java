void main(){
    var s = new java.util.Scanner(System.in);
    IO.println("Hello! Write integers: ");

    while (s.hasNextInt()) {
        IO.println("Thank you!");
        var v = s.nextInt();
        if (v <= 0){
            IO.println("No good integer, v = " + v);
            break;
        }
        IO.println("The integer is: " + v);
    }
    IO.println("Bye!");

    s.close();
}