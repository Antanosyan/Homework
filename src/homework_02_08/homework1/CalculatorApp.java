package homework_02_08.homework1;

import homework_02_08.ExseptionAndFunctionalInterface.CalculationException;
import homework_02_08.ExseptionAndFunctionalInterface.Calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> {
            if (b == 0) {
                throw new CalculationException();
            }
            return a / b;
        };

        try {
            System.out.println(addition.calculate(3, 8));
            System.out.println(subtraction.calculate(1, 7));
            System.out.println(multiplication.calculate(-9, 8));
            System.out.println(division.calculate(3, 1));
            System.out.println(division.calculate(3, 0));
        } catch (CalculationException e) {
            System.out.println(e.getMessage());
        }
    }
}
