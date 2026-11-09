// Write your code here
public class BoatUtils {
    
    public static Member[] createBoat(int seats) {
        return new Member[seats];
    }

    public static void printBoat(Member[] boat) {
        for (var i = 0; i < boat.length; i++) {
            if (boat[i] != null) {
                IO.println(boat[i].description());
            } else {
                IO.println("<Empty seat>");
            }
        }
    }

    public static boolean isBoatFull(Member[] boat) {
        boolean isEmpty = true;
        
        for (var i = 0; i < boat.length; i++) {
            if (boat[i] == null) {
                return false;
            }
        }

        if (isEmpty) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean assignMember(Member[] boat, Member m) {
        boolean assignMember = true;

        if (isBoatFull(boat)) {
            return false;
        }
        
        for (var i = 0; i < boat.length; i++) {
            if (boat[i] != null) {
                if (boat[i].equals(m)) {
                    return assignMember = false;
                }
            }
        }

        for (var i = 0; i < boat.length; i++) {
            if (boat[i] == null) {
                boat[i] = m;
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
