package org.example;

public class Calculator {
    public static int calculator(int operand1, String operator, int operand2) {
        return ArithmeticOperator.calculate(operand1,operator,operand2);
/*        int result;
        result = 0;
        if ("+" .equals(operator)) result = operand1 + operand2;
        else if ("-" .equals(operator)) result = operand1 - operand2;
        else if ("*" .equals(operator)) result = operand1 * operand2;
        else if ("/" .equals(operator)) result = operand1 / operand2;
        return result;*/
    }
}
