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

abstract class BinaryOperation implements Expression {
    public Expression e1;
    public Expression e2;

    public BinaryOperation(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public abstract double result();
    public abstract String getSymbol();

    public String format() {
        return "(" + this.e1.format() + " " + this.getSymbol() + " " +  
                this.e2.format() + ")";
    } 

}

class Addition extends BinaryOperation {
    public Addition(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public double result() {
        return this.e1.result() + this.e2.result();
    }

    @Override
    public String getSymbol() {
        return "+";
    }
}

class Subtraction extends BinaryOperation {
    public Subtraction(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public double result() {
        return this.e1.result() - this.e2.result();
    }

    @Override
    public String getSymbol() {
        return "-";
    }
}

class Multiplication extends BinaryOperation {
    public Multiplication(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public double result() {
        return this.e1.result() * this.e2.result();
    }

    @Override
    public String getSymbol() {
        return "*";
    }
}

class Division extends BinaryOperation {
    public Division(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public double result() {
        return this.e1.result() / this.e2.result();
    }

    @Override
    public String getSymbol() {
        return "/";
    }
}