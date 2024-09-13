import java.util.Scanner;

public class EntertainmentVenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        int enterPrice = 5000;
        int minAge = 16;
        double vipDiscount = 0.15;

        if (age < minAge) {
            System.exit(5);
        } else {
            System.out.print("Enter the order amount: ");
            double orderAmount = scanner.nextDouble();
            System.out.print("VIP customer or no? enter true or 1false: ");
            boolean isVip = scanner.nextBoolean();

            if (isVip) {
                orderAmount = orderAmount - orderAmount * vipDiscount;
            }
            double total = enterPrice + orderAmount;
            System.out.println(total);
        }
    }
}
