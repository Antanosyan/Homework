package homework_05_12;

public enum Item {
    LAPTOP("Laptop", 50000, 1),
    TV("TV", 20000, 2),
    PHONE("Phone", 90000, 3),  // Typically used as a gift
    REFRIGERATOR("refrigerator", 300000, 4),
    HAIR_DRY("hairDry", 7000, 5);

    private final String name;
    private final double price;
    private final int id;

    Item(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', price=" + price + "}";
    }
}

