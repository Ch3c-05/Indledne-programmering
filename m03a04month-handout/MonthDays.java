// Write your code here
// Write your code here
void main() {

    var s = new java.util.Scanner(System.in);

    
    var month = s.nextLine();
    var mKey = month.toLowerCase();
    var year = s.nextInt();

    var isLeap = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);


    var d = switch(mKey) {
                case "january", "march", "may", "july", "august", "october", "december" -> 31;
                case "april", "september", "november", "june" -> 30;
                case "february" -> isLeap ? 29:28;
                default -> 0;
            };
            System.out.println("The month of " + month + " " + year + " has " + d +" days");

    
    s.close();
}






