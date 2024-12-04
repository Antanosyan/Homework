package homework_01_12;

public class Phone extends Gift {
    private static final double MAX_PHONE_PRICE = 100000;

    public Phone(String name, double price, int id) {
        super(name, price, id);
        setPrice(price);
    }

    @Override
    public void setPrice(double price) {
        if (price > MAX_PHONE_PRICE) {
            System.out.println("Error: Phone price cannot exceed " + MAX_PHONE_PRICE);
        }
    }
}
