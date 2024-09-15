package Loops;

import java.util.Scanner;

public class DigitsOfNumber {
    //Ունեք ցանկացած չափի դրական ամողջ թիվ։ Տպեք տվյալ թվի բոլոր թվանշանները՝ ձախից աջ։
// Ձեր սկզբնական թիվը կարաք փոփոխեք ոնց ուզեք։
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        if (num < 1) {
            System.out.println("not a positive number");
            System.exit(1);
        }
        int divisor = 1;
        while (num / divisor >= 10) {
            divisor *= 10;
        }
        // Print digits from left to right
        while (divisor > 0) {
            System.out.print(num / divisor);  // Print the leftmost digit
            num %= divisor;  // Remove the leftmost digit
            divisor /= 10;  // Move to the next digit
        }
    }
}
