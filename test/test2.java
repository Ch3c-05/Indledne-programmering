void main(){

    var s = new java.util.Scanner(System.in);
    var height = 0;

    do {
        System.out.println("Please write your height in cm (between 10 and 300)");
        height = s.nextInt();
        
    } while ((height < 10) || (height > 300));

    System.out.println("Your height is: " + height + " cm");
    s.close();

}