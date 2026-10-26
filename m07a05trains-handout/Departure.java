// Write your code here
class Departure {

    int hour;
    int minutes;
    String destination;

    Departure(int hour, int minutes, String destination) {
        this.hour = hour;
        this.minutes = minutes;
        this.destination = destination;
    }

    String description() {
        return this.hour + ":" + this.minutes + " to " + this.destination;
    }

    boolean leavesBefore(Departure other) {
        if (this.hour < other.hour) {
            return true;
        } else if ((this.hour == other.hour) && (this.minutes < other.minutes)){
            return true;
        } else {
            return false;
        }
    }

    void delay(int minutes) {
        this.minutes = this.minutes + minutes;
        var extraHours = this.minutes / 60;
        var remainderMinutes = this.minutes % 60; 

        this.hour = this.hour + extraHours;
        this.minutes = remainderMinutes;

    }

}