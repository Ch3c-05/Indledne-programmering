// Write your code here
void main(){
    var s = new java.util.Scanner(System.in);
    var password = s.nextLine();
    var len = password.length();

    s.close();

    if (!(len < 5) && !(len > 8)) {
        System.out.println("Password length OK");
    } else if (len < 5) {
        System.out.println("Password too short");
    } else if (len > 8) {
        System.out.println("Password too long");
    }
}