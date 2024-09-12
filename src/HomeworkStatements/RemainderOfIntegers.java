import java.util.Scanner;

public class RemainderOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int b = scanner.nextInt();
        if (b != 0) {
            System.out.println(a % b == 0);
        } else {
            System.exit(8);
        }//I think if statement is not necessary because when b=0,appears an extension ": / by zero"
        System.out.println(a % b == 0);
    }
}
