package homework_07_12;

public class ConvertFromDecimalToBinary {

    public static String fromDecimalToBinary(int number) {
        if (number == 0) {
            return "";
        }
        return fromDecimalToBinary(number / 2) + number % 2;
    }


    public static String toBinary(int number, int sizeOfBits) {
        if (sizeOfBits == 0) {
            return "";
        }
        return toBinary(number >> 1, sizeOfBits - 1) + ((number & 1) == 0 ? "0" : "1");
    }
}
