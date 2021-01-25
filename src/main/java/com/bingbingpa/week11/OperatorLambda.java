package com.bingbingpa.week11;

import java.util.function.BiFunction;

public enum OperatorLambda {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private final String symbol;
    private final BiFunction<Integer, Integer, Integer> expression;

    OperatorLambda(String symbol, BiFunction<Integer, Integer, Integer> expression) {
        this.symbol = symbol;
        this.expression = expression;
    }

    public int calculate(int num1, int num2) {
        return expression.apply(num1, num2);
    }
}
