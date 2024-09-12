import java.util.Scanner;

public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scanner.nextInt();//384
        int firstDigit = (num / 100) % 10;
        int secondDigit = (num / 10) % 10;
        int thirdDigit = num % 10;

        if (num > 100 && num < 1000) {
            System.out.println(thirdDigit * 100 + secondDigit * 10 + firstDigit);
        } else {
            System.exit(8);//483
        }
    }
}
