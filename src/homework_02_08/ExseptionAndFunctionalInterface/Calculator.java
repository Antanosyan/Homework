package homework_02_08.ExseptionAndFunctionalInterface;

@FunctionalInterface
public interface Calculator {
    double calculate(double a, double b) throws CalculationException;

}
