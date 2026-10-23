class CowSay {
    // Write your code here
    public static void main(String[] args){
        var s = new java.util.Scanner(System.in);

        var text = s.nextLine();
        String[] words = text.split(" ");

        String line = "";
        String border1 = "_".repeat(41);
        String border2 = "-".repeat(41);
        String output = " " + border1 + System.lineSeparator();
        String cow = """
                \\   ^__^
                 \\  (oo)\\_______
                    (__)\\       )\\/\\
                        ||----w |
                        ||     ||\
        """;
        for (var i = 0; i < words.length; i++) {
            if (line.length() == 0) {
                line = words[i];
            } else if (line.length() + 1 + words[i].length() <= 39) {
                line = line + " " + words[i];
            } else {
                output = output + format(line) + System.lineSeparator();
                line = words[i];
            }
        }
        output = output + format(line) + System.lineSeparator() + " " + border2;
        IO.println(output);
        IO.println(cow);

    }

    static String format(String line) {
        var spaces = 39 - line.length();

        String padding = " ".repeat(spaces);
        return "| " + line + padding + " |";
    
    }


}
