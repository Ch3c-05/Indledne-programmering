void main() {

    var s = new java.util.Scanner(System.in);

    System.out.println("How many numbers do you want to play?");
    var n = s.nextInt();

    var numbers = new int[n];

    for (var i = 0; i < n; i++) {

        System.out.print("Please write a number (i = " + i + "): ");
        var number = s.nextInt();

        numbers[i] = number;

    }

 // for (var i = 0; i < numbers.length; i++) {
 //       var x = numbers[i];
 //       IO.println("You gave me the number: " + x);
 //   }
 //  an alternative of this for loop  or:


    for (var w: numbers) {
        IO.println("You gave me the number: " + x);
    }


    s.close();

}