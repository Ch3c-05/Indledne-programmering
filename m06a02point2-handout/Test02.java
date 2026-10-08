// Do not modify this file!

void main() {
    var p = new Point(1, 2.5);
    System.out.println("Coordinates of p: " + p.x + ", " + p.y);

    p.move(-1, 10.5);
    System.out.println("After calling p.move(...)");
    System.out.println("New coordinates of p: " + p.x + ", " + p.y);

    p.move(2.4, -7);
    System.out.println("After calling p.move(...)");
    System.out.println("New coordinates of p: " + p.x + ", " + p.y);
}
