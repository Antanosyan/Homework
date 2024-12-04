package homework_01_12;

public class HairDryer extends Gift {
    private static final double MAX_HAIRDRYER_PRICE = 30000;

    public HairDryer(String name, double price, int id) {
        super(name, price, id);
        setPrice(price);
        setId(id);
    }

    @Override
    public void setPrice(double price) {
        if (price > MAX_HAIRDRYER_PRICE) {
            System.out.println("Error: Hairdryer price cannot exceed " + MAX_HAIRDRYER_PRICE);
        }
    }
}
