class Palindromes {
    public static void main(String[] args) {
        // Write your code here

        for (var i = 0; i < args.length; i++) {

            boolean isPalindrome = true;

            for (var j = 0; j < args[i].length(); j++) {

                if (args[i].charAt(j) != args[i].charAt(args[i].length() - 1 - j)) {                    
                    isPalindrome = false;
                }
                
            }

            if (isPalindrome) {
                System.out.println(args[i] + " is a palindrome");
            } else {
                System.out.println(args[i] + " is not a palindrome");
            }

        }

    }
}
