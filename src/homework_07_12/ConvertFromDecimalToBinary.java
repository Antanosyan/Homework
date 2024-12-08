package homework_07_12;

public class ConvertFromDecimalToBinary {

    public static String fromDecimalToBinary(int number) {
        try {
            if (number < 0) {
                throw new NegativeNumberException();
            }
            if (number == 0) {
                return "";
            }
            return fromDecimalToBinary(number >> 1) + ((number & 1) == 0 ? "0" : "1");
        } catch (NegativeNumberException e) {
            return e.getMessage();
        }
    }
}
