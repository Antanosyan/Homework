package Loops;

import java.util.Scanner;

//Ունեք ֆիքսված n չափանի ամբողջ թվերի զանգված։
// n-ը որպես input ծրագիրը ստանումա command line-ից,
// դրանից հետո պետքա ներմուծեք 2 թիվ` a ու b։
public class ArrWithIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter array elements :");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the index a:");
        int a = scanner.nextInt();
        System.out.println("Enter the index b:");
        int b = scanner.nextInt();
        int minIndex = a < b ? a : b;
        int maxIndex = a > b ? a : b;
        System.out.println(minIndex + " " + maxIndex);

        if (minIndex < 0 || maxIndex >= n) {
            System.out.println("Invalid numbers a or b");
            System.exit(1);
        }
        int[] array2 = new int[maxIndex - minIndex + 1];

        for (int i = minIndex, j = 0; i <= maxIndex; i++, j++) {
            array2[j] = array1[i];
        }
    }
}
