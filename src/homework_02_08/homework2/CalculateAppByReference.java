package homework_02_08.homework2;

import homework_02_08.ExseptionAndFunctionalInterface.CalculationException;
import homework_02_08.ExseptionAndFunctionalInterface.Calculator;

public class CalculateAppByReference {
    public static void main(String[] args) {
        Calculator addition = MathOperators::add;
        Calculator subtraction = MathOperators::subtract;
        Calculator multiplication = MathOperators::multiply;
        Calculator division = MathOperators::divide;

        try {
            System.out.println(addition.calculate(2, 7));
            System.out.println(subtraction.calculate(1, 8));
            System.out.println(multiplication.calculate(2, 9));
            System.out.println(division.calculate(1, 4));
            System.out.println(division.calculate(1, 0));
        } catch (CalculationException e) {
            System.out.println(e.getMessage());
        }
    }
}
