package Structural.Composite.Calculator;

public class Expression implements ArithmeticExpression {
    Operation operation;
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;


    public Expression(Operation operation, ArithmeticExpression leftExpression, ArithmeticExpression rightExpression) {
        this.operation = operation;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int evaluate() {
        switch (operation) {
            case ADD -> {
                return leftExpression.evaluate() + rightExpression.evaluate();
            }
            case SUBTRACT -> {
                return leftExpression.evaluate() - rightExpression.evaluate();
            }
            case MULTIPLY -> {
                return leftExpression.evaluate() * rightExpression.evaluate();
            }
            case DIVIDE -> {
                return leftExpression.evaluate() / rightExpression.evaluate();
            }
        }
        return 0;
    }
}
