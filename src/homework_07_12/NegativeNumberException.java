package homework_07_12;

public class NegativeNumberException extends Exception{
    NegativeNumberException(){
        super("You entered a negative number,please enter a positive number");
    }
}
