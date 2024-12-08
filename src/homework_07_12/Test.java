package homework_07_12;

public class Test {
    public static void main(String[] args) {
        int[] array = {75, 47, 98, 124, 2, 87};
        int[] arrayIncludingNegativeValues = {-75, 47, -98, 124, -2, 87};
        for (int number : array) {
            System.out.println(ConvertFromDecimalToBinary.fromDecimalToBinary(number));
        }
        System.out.println("-------------------------");
        for (int number : arrayIncludingNegativeValues) {
            System.out.println(ConvertFromDecimalToBinary.toBinary(number,8));
        }
    }
}
