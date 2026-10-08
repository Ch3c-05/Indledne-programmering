// Write your code here
class Point {

    double x;
    double y;
    
    static void move(Point p, double dx, double dy) {
        p.x = p.x + dx;
        p.y = p.y + dy;
    }

    static Point translate(Point p, double dx, double dy) {
        var pint = new Point();
        
        pint.x = p.x + dx;
        pint.y = p.y + dy;

        return
    }

}