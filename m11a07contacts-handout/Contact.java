class Contact {
    // Write your code here
    private String name;
    private String surname;
    private String phone;
    private String email;

    public Contact(String name, String surname, String phone, String email) {
        this.setName(name);
        this.setSurname(surname);
        this.setPhone(phone);
        this.setEmail(email);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if (!isValidName(surname)) {
            throw new IllegalArgumentException("Invalid surname");
        }
        this.surname = surname;
    }

    public void setPhone(String phone) {
        if (!isValidPhone(phone)) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }

    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    private static boolean isValidName(String s) {
        return s != null && !s.isEmpty();
    }

    private static boolean isValidPhone(String s) {
        if (s == null) {
            return false;
        }
        var start = 0;
        if (s.length() > 0 && s.charAt(0) == '+') {
            start = 1;
        }
        if (s.length() - start < 1) {
            return false;
        }
        for (var i = start; i < s.length(); i++) {
            if (!isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidEmailPart(String s) {
        if (s.isEmpty()) {
            return false;
        }
        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (!isDigit(c) && !isLetter(c) && c != '.') {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidEmail(String s) {
        if (s == null) {
            return false;
        }
        var at = s.indexOf('@');
        if (at == -1 || at != s.lastIndexOf('@')) {
            return false;
        }
        var recipient = s.substring(0, at);
        var host = s.substring(at + 1);
        return isValidEmailPart(recipient) && isValidEmailPart(host);
    }

    /**
     * Is the given character a digit?
     * @param c The character to check
     * @return true if the argument 'c' is a digit, false otherwise
     */
    private static boolean isDigit(char c) {
        return ((c >= '0') && (c <= '9'));
    }

    /**
     * Is the given character a letter?
     * @param c The character to check
     * @return true if the argument 'c' is a digit, false otherwise
     */
    private static boolean isLetter(char c) {
        return (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')));
    }
}
