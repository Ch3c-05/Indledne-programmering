// Write your code here
class Date {

    int year;
    int month;
    int day;

    Date(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    String toISO() {
        if (this.month < 10) {
            if (this.day < 10) {
               return this.year + "-" + "0" + this.month + "-" + "0" + this.day; 
            } else {
               return this.year + "-" + "0" + this.month + "-" + this.day;
            }
        } else if (this.day < 10) {
            return this.year + "-" + this.month + "-" + "0" + this.day;
        } else {
            return this.year + "-" + this.month + "-" + this.day;
        }
    }

    static boolean isleapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0); 
    }

    static int daysInMonth(int year, int month) {
        var d = switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isleapYear(year) ? 29:28;
            default -> 0;
        };
        return d;
    }

    boolean isValid() {
        if (this.month < 1 || this.month > 12) {
            return false;
        }
        return this.day >= 1 && this.day <= daysInMonth(this.year, this.month);
    }

    int daysUntil(Date target) {
        var total = 0;
        for (var y = 1; y < this.year; y++) {
            total = total + (isleapYear(y) ? 366 : 365);
        }
        
        for (var m = 1; m < this.month; m++) {
            total = total + daysInMonth(this.year, m);
        }
        total = total + this.day;

        var targetTotal = 0;
        for (var y = 1; y < target.year; y++) {
            targetTotal =targetTotal + (isleapYear(y) ? 366 : 365);
        }
        
        for (var m = 1; m < target.month; m++) {
            targetTotal = targetTotal + daysInMonth(target.year, m);
        }
        targetTotal = targetTotal + target.day;
        
        return targetTotal - total;
    }


}