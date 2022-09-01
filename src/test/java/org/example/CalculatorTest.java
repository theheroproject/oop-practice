package org.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {

    // 1 + 2 -----> Calculator
    // 3 <-----

    @DisplayName("사칙 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(int operand1,String operator, int operator2 , int result) {
        int calculateResult = Calculator.calculator(operand1, operator, operator2);
        assertThat(calculateResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(arguments(1, "+", 2, 3),arguments(4, "-", 2, 2),arguments(4, "*", 2, 8),arguments(4, "/", 2, 2));
    }


    @DisplayName("덧셈 연산을 수행한다.")
    @Test
    void additionTest() {
        int result = Calculator.calculator(1, "+", 2);
        assertThat(result).isEqualTo(3);
    }

    @DisplayName("- 연산을 수행한다.")
    @Test
    void subtractionTest() {

        int result = Calculator.calculator(5, "-", 2);

        assertThat(result).isEqualTo(3);
    }

}



