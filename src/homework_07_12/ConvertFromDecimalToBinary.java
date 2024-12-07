package homework_07_12;

public class ConvertFromDecimalToBinary {

    public static String fromDecimalToBinary(int number) {
        if (number == 0) {
            return "";
        }
        return fromDecimalToBinary(number / 2) + number % 2;
    }
}
