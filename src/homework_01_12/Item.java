package homework_01_12;

public class Item {
    private String name;
    private double price;
    private Gift gift; // Optional gift
    private int id;
    static int createdItemsCount = -2;

    public Item(String name, double price, Gift gift, int id) {
        this.name = name;
        this.price = price;
        this.gift = gift;
        this.id = id;
        createdItemsCount++;
    }

    public void removeGift() {
        this.gift = null;
    }

    public Item(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
        createdItemsCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ",--> gift :" + gift + "\n"
                ;
    }
}
