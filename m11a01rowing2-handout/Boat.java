// Write your code here
public class Boat {
    private Member[] seats;

    public Boat(int seats) {
        this.seats = new Member[seats];
    }

    public void print() {
        for (var i = 0; i < this.seats.length; i++) {
            if (this.seats[i] != null) {
                IO.println(this.seats[i].description());
            } else {
                IO.println("<Empty seat>");
            }
        }
    }

    public boolean isFull() {
        boolean isEmpty = true;
        
        for (var i = 0; i < this.seats.length; i++) {
            if (this.seats[i] == null) {
                return isEmpty = false;
            }
        }

        if (isEmpty) {
            return true;
        } else {
            return false;
        }
    }

    public boolean assignMember(Member m) {
        boolean assignMember = true;

        if (isFull()) {
            return false;
        }
        
        for (var i = 0; i < this.seats.length; i++) {
            if (this.seats[i] != null) {
                if (this.seats[i].equals(m)) {
                    return assignMember = false;
                }
            }
        }

        for (var i = 0; i < this.seats.length; i++) {
            if (this.seats[i] == null) {
                this.seats[i] = m;
                return assignMember;
            }
        }

        if (assignMember) {
            return true;
        } else {
            return false;
        }
    }
}