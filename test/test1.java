void main(){
    var s = new java.util.Scanner(System.in);
    IO.println("Hello! What is your height?");
    var height = s.nextInt();

    while ((height < 50) || (height > 300)) {
        IO.println("Invalid height");
        IO.println("What is your height (in cm)? ");
        height = s.nextInt();
    }
    IO.println("Your height is valid: " + height + " cm");

    s.close();
}