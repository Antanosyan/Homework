package homework_05_12;

public class Card {
    private double balance;

    public Card(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deduct amount from balance
    public boolean deduct(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void displayCardInfo() {
        System.out.println("Balance: " + balance);
    }
}

