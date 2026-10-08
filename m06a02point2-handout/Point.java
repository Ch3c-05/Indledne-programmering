// Write your code here
class Point {

    double x;
    double y;

    
    Point(double x, double y) {
        
        this.x = x;
        this.y = y;

    }

    
    void move(double dx, double dy) {
        this.x = x + dx;
        this.y = y + dy;
    }

    Point translate(double dx, double dy) {
        var pint = new Point(x, y);
        
        pint.x = pint.x + dx;
        pint.y = pint.y + dy;

        return pint;
    }


}