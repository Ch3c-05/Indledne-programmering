class Utils {
    // Write your code here. Note that you need to define two static methods!
  

    static int monthNumber(String monthName) {

        return switch(monthName.toLowerCase()) {
            case "january" -> 1;
            case "february" -> 2;
            case "march" -> 3;
            case "april" -> 4;
            case "may" -> 5; 
            case "june" -> 6;
            case "july" -> 7;
            case "august" -> 8;
            case "september" -> 9;
            case "october" -> 10;
            case "november" -> 11;
            case "december" -> 12;
            default -> 0;
        };

    }


    static int daysInMonth(int month, int year) {

        var isLeap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));


        return switch(month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> isLeap ? 29:28;
                default -> 0;
            };

    }
        

}