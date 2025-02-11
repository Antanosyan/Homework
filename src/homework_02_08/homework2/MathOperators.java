package homework_02_08.homework2;

import homework_02_08.ExseptionAndFunctionalInterface.CalculationException;

public class MathOperators {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) throws CalculationException {
        if (b == 0) {
            throw new CalculationException();
        }
        return a / b;
    }
}
