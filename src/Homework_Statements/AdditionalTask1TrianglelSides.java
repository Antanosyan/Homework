import java.util.Scanner;

public class AdditionalTask1TrianglelSides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Let's assign sides of triangle a,b,c for good readability
        System.out.println("Enter the first side ");
        int a = scanner.nextInt();
        System.out.println("Enter the second side ");
        int b = scanner.nextInt();
        System.out.println("Enter the third side ");
        int c = scanner.nextInt();

        if (a < 1 || b < 1 || c < 1) {
            System.exit(8);
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.exit(5);
        } else {
            System.out.println("First side = " + a);
            System.out.println("Second side = " + b);
            System.out.println("Third side = " + c);
        }
    }
}
