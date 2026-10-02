// Write your code here
void main(){
    var scan = new java.util.Scanner(System.in);
 

    System.out.println("Is the animal a bird?");
    var s1 = scan.nextLine();


    if ("Yes".equals(s1)) {
        System.out.println("Does it fly?");
        var s2 = scan.nextLine();

        if ("Yes".equals(s2)) {
            System.out.println("The animal is a sparrow");
        } else if ("No".equals(s2)) {
            System.out.println("The animal is a penguin");
        }
    } else {
        System.out.println("Does it jump?");
        var s3 = scan.nextLine();

        if (s3.equals("Yes")) {
            System.out.println("The animal is a kangaroo");
        } else if (s3.equals("No")) {
        System.out.println("The animal is a camel");
    }

    }
    
    scan.close();

}