// Write your code here
void main() {
    var s = new java.util.Scanner(System.in);
    
    while (s.hasNextLine()) {

        var n = s.nextLine();

        var d = switch(n) {

            case "Dog" -> "Woof";
            case "Cat" -> "Meow";
            case "Sheep" -> "Baa";
            case "Cow" -> "Moo";
            case "Lion" -> "Roar";
            case "Pig" -> "Oink";
            case "Duck" -> "Quack";
            default -> "?";
        };
        System.out.println(d);

    }

    s.close();
}