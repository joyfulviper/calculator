package calculator;

public class Calculator {
    private int a;
    private int b;

    public void setOperands(int a, int b) {
        this.a = a;
        this.b = b;
    }
    private int plus() {
        return a + b;
    }

    private int minus() {
        return a - b;
    }

    private int divide() {
        return a / b;
    }

    private int remain() {
        return a % b;
    }

    public void printPlus() {
        System.out.println("더하기 연산: " + plus());
    }

    public void printMinus() {
        System.out.println("빼기 연산: " + minus());
    }

    public void printDivide() {
        System.out.println("나누기 연산: " + divide());
    }

    public void printRemain() {
        System.out.println("나머지 연산: " + remain());
    }

}
