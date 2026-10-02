// Write your code here
// Write your code here
void main(){
    var scan = new java.util.Scanner(System.in);

    var yes = "yes";
    var no = "no";


    System.out.println("Is the animal a bird?");
    var s1 = scan.nextLine().toUpperCase();
    
    
    if (!s1.equals("YES") && !s1.equals("NO")){
        System.out.println("Invalid answer!");
        return;
    }


    if (s1.equals("YES")) {
        System.out.println("Does it fly?");
        var s2 = scan.nextLine().toUpperCase();


        if (!s2.equals("YES") && !s2.equals("NO")){
            System.out.println("Invalid answer!");
            return;
        }


        if (s2.equals("YES")) {
            System.out.println("The animal is a sparrow");
        } else if (s2.equals("NO")) {
            System.out.println("The animal is a penguin");
        }



    } else {
        System.out.println("Does it jump?");
        var s3 = scan.nextLine().toUpperCase();
 
        if (!s3.equals("YES") && !s3.equals("NO")){
            System.out.println("Invalid answer!");
            return;
        }


        if (s3.equals("YES")) {
            System.out.println("The animal is a kangaroo");
        } else if (s3.equals("NO")) {
        System.out.println("The animal is a camel");
        
    }

    }
    
    scan.close();

}