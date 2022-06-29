package calculator;


public interface Calculator { //계산기의 공통점 추상화

    double calculate(double a, double b);
    /*private double a;
    private double b;

    private char operator;

    public Calculator() {
        setOperands();
        printResult();
    }

    private void setOperands() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("a값 입력: ");
            this.a = sc.nextDouble();

            System.out.print("연산자 입력: ");
            this.operator = sc.next().charAt(0);

            System.out.print("b값 입력: ");
            this.b = sc.nextDouble();
            if(operator == '/' && b == 0) throw new Exception("0으로는 나눌 수 없습니다.");

            sc.close();
        } catch (InputMismatchException ie) {
            System.out.println("알맞은 값을 입력하세요");
            setOperands();
        } catch (Exception e) {
            System.out.println("0으로는 나눌 수 없습니다.");
            setOperands();
        }

    }


    private double operate(char operator) {
            if (operator == '+') {
                return plus();
            }
            if (operator == '-') {
                return minus();
            }
            if (operator == '*') {
                return multiple();
            }
        return divide();
    }
    private double plus() {
        return a + b;
    }

    private double minus() {
        return a - b;
    }

    private double multiple() { return a * b;}

    private double divide()  {
        return a / b;
    }

    private void printResult() {
        System.out.println("결과: " + operate(operator));
    }*/

}
