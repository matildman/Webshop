package hu.training360.horvathaj.Webshop;

import java.util.ArrayList;
import java.util.List;

public class ShopItems {

    private List<ShopItem> items = new ArrayList<>();

    public ShopItems() {

    }

     public void addItem(String itemName, int price, boolean megapack) throws InvalidWebshopOperations {

        if (!items.add(new ShopItem(itemName, price, megapack) ) ) {
            throw new InvalidWebshopOperations("Hibás webshop tétel!",Exceptions.WRONG_ITEM);
        }

    }

    public List<ShopItem> getItems() {
        return items;
    }
}
