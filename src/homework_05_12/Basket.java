package homework_05_12;

public class Basket {
    private Item[] items;  // Fixed array for items
    private int itemCount;       // Number of items in the basket
    private double totalPrice;   // Total price of items (excluding gifts)

    public Basket(int capacity) {
        items = new Item[capacity];
        itemCount = 0;
        totalPrice = 0;
    }

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("Basket is full. Cannot add more items.");
            return;
        }
        items[itemCount] = item;
        //  totalPrice += item.getPrice();
        itemCount++;
    }

    public Item[] getItems() {
        return items;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (int i = 0; i < itemCount; i++) {
            if (items[i] == null) continue;
            if (!((items[i] == Item.PHONE && items[i].getPrice() < 100000) ||
                    (items[i] == Item.HAIR_DRY && items[i].getPrice() < 30000))) {
                totalPrice += items[i].getPrice();
            }
        }
        return totalPrice;
    }

    public void validateCard(double cardBalance) {
        System.out.println(cardBalance >= calculateTotalPrice() ? "Enough money" : "no enough money");
    }

    public int giftCount() {
        int giftCount = 0;
        for (Item item : items) {
            if (item == Item.HAIR_DRY && Item.HAIR_DRY.getPrice() <= 30000) {
                giftCount++;
            }
            if (item == Item.PHONE && Item.PHONE.getPrice() <= 100000) {
                giftCount++;
            }
        }
        return giftCount;
    }

    public void checkout(Card card) throws MoreThanOneItemException {
        if (giftCount() > 1) {
            System.out.println(giftCount());
            throw new MoreThanOneItemException();
        }
        try {
            validateCard(card.getBalance());
            if (!card.deduct(calculateTotalPrice())) {
                throw new RuntimeException("Insufficient funds on the card!");
            }
            System.out.println("Checkout successful! Total price: " + calculateTotalPrice());
            clearBasket();

        } catch (RuntimeException e) {
            System.out.println("Error during checkout: " + e.getMessage());
            throw e;
        }
    }

    public void clearBasket() {
        items = new Item[items.length];
        itemCount = 0;
        System.out.println("Basket cleared.");
    }

    public void displayBasket() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].getName() + ": price - " +
                    items[i].getPrice() + ", id- " + items[i].getId());

        }
    }

    public void removeGiftById(int id) {

        for (int i = 0; i < itemCount; i++) {
            // Check if the current item matches the given ID
            if (items[i] != null && items[i].getId() == id) {
                // Remove the item by shifting elements
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }
                // Set the last element to null
                items[itemCount - 1] = null;
                itemCount--;
                break;
            }
        }
    }
}
