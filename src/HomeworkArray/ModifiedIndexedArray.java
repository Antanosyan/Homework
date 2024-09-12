package HomeworkArray;

import java.util.Scanner;

public class ModifiedIndexedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an array size: ");
        int n = scanner.nextInt();
        if (n < 4) {
            System.exit(1);
        }
        System.out.println("Enter an index: ");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("negative index");
            System.exit(1);
        }
        if (a >= n - 3) {
            System.out.println("no enough elements");
            System.exit(1);
        }
        int[] arr = new int[n];
        arr[a + 1] = a + 1;
        arr[a + 2] = a + 2;
        arr[a + 3] = a + 3;

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
