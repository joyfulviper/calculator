package calculator;

public class PlusCalculate implements Calculator { //다양한 계산기 구현 다형성

    @Override
     public double calculate(double a, double b) {
        return a + b;
    }
}
