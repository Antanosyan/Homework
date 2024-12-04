package homework_01_12;

public abstract class Gift extends Item {
    public Gift(String name, double price, int id) {
        super(name, price, id);
    }

    @Override
    public String toString() {
        return " Item {" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", id=" + getId() +
                '}';
    }
}
