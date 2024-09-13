import java.util.Scanner;

public class PrintDigitsOfFourDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the four digit number: ");
        int num = scanner.nextInt();
        int firstDigit = (num / 1000);
        int secondDigit = (num / 100) % 10;
        int thirdDigit = (num / 10) % 10;
        int fourthDigit = num % 10;
        if (num > 999 && num < 10000) {
            System.out.println(firstDigit);
            System.out.println(secondDigit);
            System.out.println(thirdDigit);
            System.out.println(fourthDigit);
        } else {
            System.exit(2);
        }
    }
}
