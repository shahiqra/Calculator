package application;

public class Model {
    public float calculate(long number1, long number2, String operator) {
        double result;

        switch (operator) {
            case "+":
                result = number1 + number2;
                return (float) result;

            case "-":
                result = number1 - number2;
                return (float) result;

            case "*":
                result = number1 * number2;
                return (float) result;

            case "/":
                if (number2 != 0) {
                    result = (double) number1 / number2;
                    return (float) result;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }

            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
                
        }
        
    }
}
