package Structural.Composite.Calculator;


import static Structural.Composite.Calculator.Operation.ADD;
import static Structural.Composite.Calculator.Operation.MULTIPLY;

public class Main {
    public static void main(String[] args) {
        Number number1 = new Number(1);
        Number number2 = new Number(2);
        Expression expression1 = new Expression(ADD, number1, number2);
        Number number3 = new Number(3);
        Expression expression2 = new Expression(MULTIPLY, number3, expression1);

        System.out.println(expression2.evaluate());

    }
}
