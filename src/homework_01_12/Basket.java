package homework_01_12;

import java.util.Arrays;

public class Basket {
    private Item[] items;
    private int itemCount;

    public Basket() {
        this.items = new Item[Item.createdItemsCount];
        this.itemCount = 0;
    }

    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        } else {
            System.out.println("Basket is full.");
            checkIfNoDuplicate();
        }
    }

    public void checkIfNoDuplicate() {
        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i].equals(items[j])) {
                    System.out.println("You can not to add same Item twice." + "\n" +
                            "Please remove duplicate.");
                    return;
                }
            }
        }
    }

    public void removeGiftById(int id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId() == id && items[i].getGift() != null) {
                items[i].removeGift();
                return;
            }
        }
        System.out.println("Gift not found for the specified item ID.");
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice();
        }
        return totalPrice;
    }

    public void validateCard(double cardBalance) {
        System.out.println(cardBalance >= calculateTotalPrice() ? "Enough money" : "no enough money");
    }

    public int giftCount() {
        int giftCount = 0;
        for (Item elem : items) {
            if (elem.getGift() != null) {
                giftCount++;
            }
        }
        return giftCount;
    }

    public void clearBasket() {
        items = new Item[items.length];
        itemCount = 0;
        System.out.println("Basket cleared.");
    }

    public void checkout(Card card) {
        try {
            if (giftCount() > 1) {
                throw new RuntimeException("More than one gift selected! Please remove one.");
            }
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

    @Override
    public String toString() {
        return "Basket:" + ", itemCount=" + itemCount + "\n" +
                "items=" + Arrays.toString(items);
    }
}
