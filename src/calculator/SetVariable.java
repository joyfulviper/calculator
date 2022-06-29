package calculator;

import java.util.Scanner;

public class SetVariable {

    private static final Scanner sc = new Scanner(System.in);

    public static double setLeft() {
        System.out.print("a값 입력:");
        return sc.nextDouble();
    }

    public static double setRight() {
        System.out.print("b값 입력:");
        return sc.nextDouble();
    }

    public static char setOperator() {
        System.out.print("연산자 입력:");
        return sc.next().charAt(0);
    }
}
