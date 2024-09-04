import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase letter: ");
        char lowercaseLetter = scanner.next().charAt(0);

        char uppercaseLetter = (char) (lowercaseLetter - 32);

        System.out.println("The uppercase letter is: " + uppercaseLetter);
    }
}
