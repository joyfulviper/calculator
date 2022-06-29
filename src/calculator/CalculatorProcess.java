package calculator;


public class CalculatorProcess {

    public static double create(char operator, double a, double b) {
        if(check(operator)) return calculate(operator, a, b);
        throw new IllegalArgumentException();
    }

    private static boolean check(Character operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }

    private static double calculate(char operator, double a, double b) {
        return CalculatorMapper.getCalculator(operator).calculate(a, b);
    }

}
