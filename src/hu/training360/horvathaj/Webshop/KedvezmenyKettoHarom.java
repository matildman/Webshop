package hu.training360.horvathaj.Webshop;

public class KedvezmenyKettoHarom {
    public int KettoHaromSzamol(ShopItem OneItem) {

        int szamoltKedv;
        szamoltKedv = 0;

        if (!OneItem.isMegapack() )
            szamoltKedv = (OneItem.getCount() / 3) * OneItem.getPrice();
        return szamoltKedv;
    }
}
