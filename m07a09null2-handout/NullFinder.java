// Do not modify this class!
class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Do not modify this class!
class Company {
    String name;
    Employee[] employees;

    Company(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }
}

class NullFinder {
    static boolean containsNull(Employee[] arr) {
        if (arr == null) {
            return true;
        }
        for (Employee e : arr) {
            if (e == null || e.name == null) {
                return true;
            }
        }
        return false;
    }

    static boolean containsNull(Company c) {
        if (c == null || c.name == null) {
            return true;
        }
        return containsNull(c.employees); // true if employees is null or contains a null
    }

    static boolean containsNull(Company[] arr) {
        if (arr == null) {
            return true;
        }
        for (Company c : arr) {
            if (containsNull(c)) { // true if c itself is null or contains a null
                return true;
            }
        }
        return false;
    }
}
