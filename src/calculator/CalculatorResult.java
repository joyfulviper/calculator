package calculator;

import java.util.Scanner;

public class CalculatorResult {

    private static double create() {
        return CalculatorProcess.create(SetVariable.setOperator(), SetVariable.setLeft(), SetVariable.setRight());
    }

    public static void run() {
        System.out.println("결과:" + create());
    }

}
