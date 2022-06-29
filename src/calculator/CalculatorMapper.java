package calculator;

import java.util.HashMap;
import java.util.Map;

public class CalculatorMapper {

    private final static Map<Character, Calculator> calculatorMap = new HashMap<>();

    static {
        calculatorMap.put('+', new PlusCalculate());
        calculatorMap.put('-', new MinusCalculator());
        calculatorMap.put('/', new DivideCalculator());
        calculatorMap.put('*', new MultipleCalculator());
    }

    public static Calculator getCalculator(char operator) {
        return calculatorMap.get(operator);
    }

}
