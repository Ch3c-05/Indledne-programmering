// Write your code here
void main() {

    var s = new java.util.Scanner(System.in);
    var n = s.nextInt();

    s.close();

    for (var row = 1; row <= n; row++) {


        for (var i = 0; i < n - row ; i++) {

            System.out.print(".");

        }

        for (var i = 0; i < 2 * row - 1; i++) {

            System.out.print("#");

        }

        for (var i = 0; i < n - row; i++) {

            System.out.print(".");

        }
        System.out.println();


    }

}