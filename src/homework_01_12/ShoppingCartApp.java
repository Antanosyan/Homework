package homework_01_12;

public class ShoppingCartApp {
    public static void main(String[] args) {

        Gift phone = new Phone("Phone", 80000, 123);
        Gift hairDryer = new HairDryer("Hair Dryer", 50, 124);

        Card card = new Card(500000);
        card.displayCardInfo();

        Item laptop = new Item("Laptop", 900, phone, 1);
        Item tv = new Item("TV", 500, hairDryer, 2);
        Item tv1 = new Item("TV", 300, 3);
        Item tv2 = new Item("TV", 500, 4);
        Item tv3 = new Item("TV", 50, 5);

        Basket basket = new Basket();

        basket.addItem(laptop);
        basket.addItem(tv1);
        basket.addItem(tv2);
        basket.addItem(tv3);
        basket.addItem(tv);
        basket.removeGiftById(1);
        System.out.println(basket);
        basket.checkout(card);
        card.displayCardInfo();
        System.out.println(basket);

    }
}
