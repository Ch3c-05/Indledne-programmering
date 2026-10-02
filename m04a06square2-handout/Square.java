void main() {
    var scanner = new java.util.Scanner(System.in);
    scanner.useLocale(java.util.Locale.ENGLISH);

    var n = scanner.nextInt();

    var square = Utils.createSquare(n);

    System.out.print(square);

    scanner.close();
}
