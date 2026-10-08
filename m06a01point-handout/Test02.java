// Do not modify this file!

void main() {
    var p = new Point();
    p.x = 1;
    p.y = 2.5;
    System.out.println("Coordinates of p: " + p.x + ", " + p.y);

    Point.move(p, -1, 10.5);
    System.out.println("After calling Point.move(p, ...)");
    System.out.println("New coordinates of p: " + p.x + ", " + p.y);

    Point.move(p, 2.4, -7);
    System.out.println("After calling Point.move(p, ...)");
    System.out.println("New coordinates of p: " + p.x + ", " + p.y);
}
