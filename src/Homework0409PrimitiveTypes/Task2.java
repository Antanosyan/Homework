import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        System.out.println((int)(num1+num2+num3));

        double sum = num1+num2+num3;
        int wholePart = (int)sum;
        double decimalPart = (sum-wholePart);
        System.out.println(decimalPart);
        System.out.println(wholePart);
    }
}
