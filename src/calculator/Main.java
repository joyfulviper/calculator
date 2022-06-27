package calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperands(10, 20);
        calculator.printPlus();
        calculator.printMinus();
        calculator.printDivide();
        calculator.printRemain();
    }
}
