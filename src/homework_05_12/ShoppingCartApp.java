package homework_05_12;

public class ShoppingCartApp {
    public static void main(String[] args) {

        Basket basket = new Basket(7);
        Card card = new Card(500000);

        basket.addItem(Item.LAPTOP);
        basket.addItem(Item.TV);
        basket.addItem(Item.REFRIGERATOR);
        basket.addItem(Item.PHONE);
        basket.addItem(Item.HAIR_DRY);
        basket.removeGiftById(5);
        basket.displayBasket();

        try {
            basket.checkout(card);
        } catch (MoreThanOneItemException e) {
            System.out.println("Error during checkout: " + e.getMessage());
        }
    }
}
