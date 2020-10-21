package hu.training360.horvathaj.Webshop;

import java.util.Scanner;

public class ShopItem {
    private String itemname;
    private int price;
    private boolean megapack;
    private int count;

    public ShopItem(String itemname, int price, boolean megapack) {
        this.itemname = itemname;
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
                "Termék neve=" + itemname +
                " ; termék ára=" + price +
                " ; megapack =" + megapack +
                " ; darabszám =" + count
                ;
    }

    public int setCount() throws InvalidWebshopOperations {
        int darab;
        Scanner reader= new Scanner(System.in);

        System.out.print(this.itemname+" mennyiség: ");
        darab = reader.nextInt();
        if (darab < 0) {
            throw new InvalidWebshopOperations("Negatív darabszám nem adható meg!",Exceptions.ZERO_AMOUNT);
        }
        this.setCount(darab);
        return this.getCount()*this.getPrice();

    }

}
