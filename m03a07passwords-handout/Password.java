// Write your code here
// Write your code here
void main(){
    var s = new java.util.Scanner(System.in);


    while (s.hasNextLine()) {

        var password = s.nextLine();
        var len = password.length();


        if (len < 5) {
            System.out.println("Password too short");

        } else if (len > 8) {
            System.out.println("Password too long");
            
        } else {
            System.out.println("Password length OK");
            break;

        }

    }

    s.close();
}