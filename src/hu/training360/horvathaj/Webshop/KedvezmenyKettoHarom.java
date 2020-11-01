package hu.training360.horvathaj.Webshop;

public class KedvezmenyKettoHarom {
    public int kettoHaromSzamol(ShopItem oneItem) {

        int szamoltKedv;
        szamoltKedv = 0;

        if (!oneItem.isMegapack() )
            szamoltKedv = (oneItem.getCount() / 3) * oneItem.getPrice();
        return szamoltKedv;
    }
}
