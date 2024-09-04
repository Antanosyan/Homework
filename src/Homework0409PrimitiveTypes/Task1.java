package Homework0409PrimitiveTypes;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int firstDigit = (num/1000);
        int secondDigit = (num/100)%10;
        int thirdDigit = (num/10)%10;
        int fourthDigit = num%10;

        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
        System.out.println(fourthDigit);
    }
}