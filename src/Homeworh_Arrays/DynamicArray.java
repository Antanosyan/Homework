package Homeworh_Arrays;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int n = scanner.nextInt();
        int[] arr;

        switch (n) {
            case 3:
            case 4:
            case 5:
                arr = new int[n];
                break;
            case 6:
                n = 10;
                arr = new int[n];
                break;
            case 7:
                n = 10;
                arr = new int[n];
                break;
            default:
                n = 15;
                arr = new int[n];
        }
        for (int el:arr){
            System.out.print(el + " ");
        }
    }
}
