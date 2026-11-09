// Write your code here
interface Expression {
    public double result();
    public String format();
}

class Constant implements Expression {
    private double value;

    public Constant(double value) {
        this.value = value;
    }

    public double result() {
        return this.value;
    }

    public String format() {
        return Double.toString(this.value);
    }
}

class Addition implements Expression {
    private Expression e1;
    private Expression e2;

    public Addition(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double result() {
        return this.e1.result() + this.e2.result();
    }

    public String format() {
        return "(" + this.e1.format() + " + " + 
                this.e2.format() + ")";
    }
}

class Subtraction implements Expression {
    private Expression e1;
    private Expression e2;

    public Subtraction(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double result() {
        return this.e1.result() - this.e2.result();
    }

    public String format() {
        return "(" + this.e1.format() + " - " + 
                this.e2.format() + ")";
    }
}

class Multiplication implements Expression {
    private Expression e1;
    private Expression e2;

    public Multiplication(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double result() {
        return this.e1.result() * this.e2.result();
    }

    public String format() {
        return "(" + this.e1.format() + " * " + 
                this.e2.format() + ")";
    }
}

class Division implements Expression {
    private Expression e1;
    private Expression e2;

    public Division(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double result() {
        return this.e1.result() / this.e2.result();
    }

    public String format() {
        return "(" + this.e1.format() + " / " + 
                this.e2.format() + ")";
    }
}