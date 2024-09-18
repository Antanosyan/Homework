import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first short number :");
        short num1 = scanner.nextShort();
        System.out.println("Enter second short number :");
        short num2 = scanner.nextShort();
        System.out.println("Enter third short number :");
        short num3 = scanner.nextShort();

        int sum = num1 + num2 + num3;
        int average = sum / 3;
        if (num1 < 0) {
            num1 *= -1;
        }
        if (num2 < 0) {
            num2 *= -1;
        }
        if (num3 < 0) {
            num3 *= -1;
        }
        int sumAbs = num1 + num2 + num3;
        System.out.println(sumAbs/average);
    }
}
