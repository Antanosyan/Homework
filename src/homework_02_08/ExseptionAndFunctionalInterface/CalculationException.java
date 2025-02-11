package homework_02_08.ExseptionAndFunctionalInterface;

public class CalculationException extends Exception{
    public CalculationException(){
        super("Calculation error: Dividing by 0");
    }
}
