import java.util.Scanner;

public class LowercaseToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a lowercase letter: ");
        char lowercaseLetter = scanner.next().charAt(0);
        char uppercaseLetter = (char) (lowercaseLetter - 32);
        if (lowercaseLetter >= 'a' && lowercaseLetter <= 'z') {
            System.out.println("The uppercase letter is: " + uppercaseLetter);
        } else {
            System.exit(5);
        }
    }
}
