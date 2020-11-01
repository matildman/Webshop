package hu.training360.horvathaj.Webshop;

import java.util.Scanner;

public class ShopItem {
    private String itemName;
    private int price;
    private boolean megapack;
    private int count;

    public ShopItem(String itemName, int price, boolean megapack) {
        this.itemName = itemName;
        this.price = price;
        this.megapack = megapack;
    }

    public boolean isMegapack() {
        return megapack;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getItemData() {
        return "Bolti készlet : " +
                "Termék neve=" + itemName +
                " ; termék ára=" + price +
                " ; megapack =" + megapack +
                " ; darabszám =" + count
                ;
    }

    public int setCount() throws InvalidWebshopOperations {
        int darab;
        Scanner reader= new Scanner(System.in);

        System.out.print(this.itemName+" mennyiség: ");
        darab = reader.nextInt();
        if (darab < 0) {
            throw new InvalidWebshopOperations("Negatív darabszám nem adható meg!",Exceptions.ZERO_AMOUNT);
        }
        this.setCount(darab);
        return this.getCount()*this.getPrice();

    }

}
