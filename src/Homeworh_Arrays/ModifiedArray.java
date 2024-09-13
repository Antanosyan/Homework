package Homeworh_Arrays;

import java.util.Scanner;


public class ModifiedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an amount of elements ");
        int n = scanner.nextInt();

        if (n < 2 || n > 8) {
            System.exit(1);
        }
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.exit(1);
        }
        int[] numbers = new int[n];
        int leftIndex = n / 2;
        int rightIndex;
        int small = (a < b) ? a : b;
        int large = (a > b) ? a : b;

        if (n % 2 == 0) {
            rightIndex = leftIndex;
        } else {
            rightIndex = leftIndex + 1;
        }

        if (leftIndex > 0) {
            numbers[leftIndex - 1] = small;
            numbers[rightIndex] = large;
            leftIndex--;
            rightIndex++;
        }
        if (leftIndex > 0) {
            numbers[leftIndex - 1] = small;
            numbers[rightIndex] = large;
            leftIndex--;
            rightIndex++;
        }
        if (leftIndex > 0) {
            numbers[leftIndex - 1] = small;
            numbers[rightIndex] = large;
            leftIndex--;
            rightIndex++;
        }
        if (leftIndex > 0) {
            numbers[leftIndex - 1] = small;
            numbers[rightIndex] = large;
        }
    }
}

