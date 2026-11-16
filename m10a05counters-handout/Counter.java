// Write your code here
public class Counter {
    private int initial;

    public Counter(int initial) {
        this.initial = initial;
    }

    public int getValue() {
        return this.initial; 
    }

    public void setValue(int value) {
        this.initial = value;
    }

    public void increment() {
        this.initial = this.initial + 1; 
    }

    public void decrement() {
        this.initial = this.initial - 1;
    }
}

class StaticCounter {
    private static int initial = 0;

    public static int getValue() {
        return StaticCounter.initial; 
    }

    public static void setValue(int value) {
        StaticCounter.initial = StaticCounter.initial + value;
    }

    public static void increment() {
        StaticCounter.initial = StaticCounter.initial + 1; 
    }

    public static void decrement() {
        StaticCounter.initial = StaticCounter.initial - 1;
    }
}