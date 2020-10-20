package hu.training360.horvathaj.Webshop;

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


}
